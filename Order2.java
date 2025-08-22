import java.util.Scanner;

class Order2 {
    int quantity;
    int price;

    Order2(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    int getTotal() {
        return quantity * price;
    }
}

public class OOPOrderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        Order2[] orders = new Order2[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Order " + (i + 1) + ":");
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter price per unit: ");
            int price = sc.nextInt();

            orders[i] = new Order2(quantity, price);
            total += orders[i].getTotal();
        }

        System.out.println("Total Price (OOP): ₹" + total);
        sc.close();
    }
}
