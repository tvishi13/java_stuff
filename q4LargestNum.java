import java.util.Scanner;
class q4LargestNum {
 public static void main(String[] args) {
	 double num1, num2, num3;   
         Scanner sc = new Scanner(System.in);
	 System.out.print("Enter 1st number: ");
	 num1 = sc.nextDouble();
         System.out.print("Enter 2nd number: ");
	 num2 = sc.nextDouble();
         System.out.print("Enter 3rd number: ");
	 num3 = sc.nextDouble();

         if (num1>num2 && num1>num3){
              System.out.println("Is 1st number the largest?  _Yes_" );}
         else if (num2>num1 && num2>num3){
              System.out.println("Is 2nd number the largest?  _Yes_" );}
         else{
              System.out.println("Is 3rd number the smallest?  _Yes_" );}
      }
}
