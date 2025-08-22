import java.util.Scanner;
 public class GreatestFactor {
  public static void main(String[] args) {

   int number , greatestfactor = 1;

   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number :");
   number = input.nextInt();

   for(int i = 1;i <= number-1 ; i++) {

    if(number % i == 0){

     greatestfactor = i;
    }
   }
System.out.println("The greatest factor of the given number " +number+ " is : " +greatestfactor);
}
}

   
    