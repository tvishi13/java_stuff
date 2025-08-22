class Product {
    String productName;
    int[] stockHistory; 
    Product(String productName, int[] stockHistory) {
        this.productName = productName;
        this.stockHistory = stockHistory;
    }
    int getLastMonthIncrease() {
        int n = stockHistory.length;
        return stockHistory[n - 1] - stockHistory[n - 2];
    }
}
public class ProductMain {
    public static void main(String[] args) {
               Product[] products = new Product[4];
        products[0] = new Product("Laptop", new int[]{50, 55, 60, 70});
        products[1] = new Product("Phone", new int[]{80, 82, 90, 95});
        products[2] = new Product("Tablet", new int[]{30, 35, 38, 50});
        products[3] = new Product("Headphones", new int[]{100, 105, 108, 120});
        Product maxIncreaseProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getLastMonthIncrease() > maxIncreaseProduct.getLastMonthIncrease()) {
                maxIncreaseProduct = products[i];
            }
        }
        System.out.println("Product with highest stock increase last month:");
        System.out.println("Name: " + maxIncreaseProduct.productName);
        System.out.println("Increase: " + maxIncreaseProduct.getLastMonthIncrease());
    }
}
