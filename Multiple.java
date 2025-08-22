import java.util.Scanner;
 public class Multiple {
  public static void main(String[] args) {

   int number;

   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number below 100 : ");
   number = input.nextInt();
   System.out.println(" Multiple of number : " );

   for(int i = 100 ; i >=1 ; i--) {

    if(number % i == 0) {
     System.out.println(i + "\t");
   }
 }
}
}