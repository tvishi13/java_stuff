import java.util.Scanner;
class factorailUsingWhile {
    public static void main(String[] args) {
	 int number;
         int factorial = 1;
         int i = 1;
         Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a positive integer: ");
	 number = sc.nextInt();
                  
         if (number>0){
             while (i<=number){
                  factorial *= i;
                  i++;}
              System.out.println("Factorial of " + number + " is = " + factorial);}
         else{
             System.out.println("Please enter a positive integer!");}
    }
}
