import java.util.Scanner;


class Divisible {

   public static void main(String[] args) {

      // Create a Scanner Object

      Scanner input = new Scanner(System.in);


      // Get 1 input values for angles

      int x = input.nextInt();




      if (x%5 == 0) {

         System.out.println("The number is divisible by 5");

      } else {

         System.out.println("The number is not divisible by 5");

      }


      // Closing the Scanner Stream

      input.close();

   }

}