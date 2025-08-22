import java.util.Scanner;


class FirstSmall {

   public static void main(String[] args) {

      // Create a Scanner Object

      Scanner input = new Scanner(System.in);


      // Get 3 input values for angles

      int x = input.nextInt();

      int y = input.nextInt();

      int z = input.nextInt();


   
      if (x<y && x<z) {

         System.out.println("The first number is the smallest");

      } else {

         System.out.println("No the first number isn't the smallest");

      }


      // Closing the Scanner Stream

      input.close();

   }

}