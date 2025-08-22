import java.util.Scanner;
class Vote {
 public static void main(String[] args) {
	 int age;   
         Scanner sc = new Scanner(System.in);
	 System.out.print("Enter age of the person: ");
	 age = sc.nextInt();

         if (age>=18){
             System.out.println("The person is eligible to vote.");}
         else{
             System.out.println("The person is not eligible to vote.");}
      }
  
}
