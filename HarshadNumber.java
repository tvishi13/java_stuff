import java.util.Scanner;
public class HarshadNumber{
    public static void main (String args []){
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for the Harshad Number: ");
        number = sc.nextInt();
	 
        while (number > 0) {
            int digit = number % 10; 
            sum += digit; 
            number = number / 10;}
        System.out.println("The sum of digits is: " + sum);
       
        if (sum % 3 == 0){
	    System.out.print("The number is a Harshad Number.");}
        else 
	    System.out.print("The number is not a Harshad Number.");
	
    }
}
