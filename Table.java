import java.util.Scanner;
 public class Table {
  public static void main(String[] args) {

   int number ;

   Scanner input = new Scanner(System.in);

   System.out.print(" Enter the number :");
   number = input.nextInt();

   for(int i = 6 ; i <= 9 ; i++) {
    
    int result = number * i; 
    System.out.println(number + "*" +i+ " = " +result); 
  }
 }
}