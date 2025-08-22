import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {

double total = 0.0;         
        double num; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 to stop): ");
        num = sc.nextDouble();

        while (num != 0){
            total += num; 
            System.out.print("Enter another number (0 to stop): ");
            num = sc.nextDouble();}
        System.out.println("Total sum: " + total);

       }
}

