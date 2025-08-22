import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        double total = 0.0;
        double num;
        Scanner sc = new Scanner(System.in);
         

        while (true){ 
            System.out.print("Enter a number (0 or negative to stop): ");
            num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num; 
        }
        System.out.println("Total sum: " + total);
     }

}