import java.util.Scanner;
 public class OddEven {
  public static void main(String[] args) {
   
   int number ;

   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the number : ");
   number = input.nextInt();
   
   
    if ( number % 2 == 0 ) {
     
     System.out.print(number+ " is even \n "); 
     
    }
      
    else {
     System.out.print(number +" is odd \n ");
    
   }
}
}
     
