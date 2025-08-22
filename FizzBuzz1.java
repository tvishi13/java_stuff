import java.util.Scanner;
 public class FizzBuzz1 {
  public static void main(String[] args){

   int number;

   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number : ");
   number = input.nextInt();

    int i = 0;
   
    while(i<=number) {
  
     
     if(i%3 == 0 && i%5 == 0) {
       System.out.println("FizzBuzz \n");
       }
     
     else if(i%3 == 0) {
      System.out.println("Fizz \n");
      }
     
     else if(i%5 == 0) {
       System.out.println("Buzz \n");
       }
 
      else {
       System.out.println(i);
       System.out.println("\n");
    }
   i++;
 }
}
}