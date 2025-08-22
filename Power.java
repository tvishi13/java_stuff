import java.util.Scanner;
 public class Power {
  public static void main(String[] args) {

   int number , power;
   int result = 1;

   Scanner input = new Scanner(System.in);

  System.out.print("Enter the number : ");
  number = input.nextInt();

  System.out.print("Enter the power : ");
  power = input.nextInt();

  for(int i=1 ; i<=power ; i++) {
   
   result *= number;
  }

  System.out.println("Result : " +result);
 }
} 

  