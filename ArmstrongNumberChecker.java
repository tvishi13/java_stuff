import java.util.Scanner;
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        
        while (originalNumber != 0){
            int digit = originalNumber % 10; 
            sum += Math.pow(digit,3); 
            originalNumber /= 10;}
        
        if (sum==number){
            System.out.println(number + " is an Armstrong Number.");}
        else{
            System.out.println(number + " is not an Armstrong Number.");}
    }
}
