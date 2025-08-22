import java.util.Scanner;
public class ArithmeticOperations {
    public static void main (String args []){
        double first, second;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        first = sc.nextDouble();
        System.out.print("Enter second number: ");
        second = sc.nextDouble();
        System.out.print("Enter operation (+,-,*,/) to be performed: ");
        op = sc.next();
        
        switch (op){
            case "+":
                System.out.println("Sum is: " + (first+second));
                break;
            case "-":
                System.out.println("Difference is: " + (first-second));
                break;
            case "*":
                System.out.println("Product is: " + (first*second));
                break;
            case "/":
                System.out.println("Division is: " + (first/second));
                break;
            default:
                System.out.println("Invalid Operator.");}
    }
}
