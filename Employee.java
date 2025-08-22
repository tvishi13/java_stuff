import java.util.Scanner;
 public class Employee {
  public static void main(String[] args) {

   int years , salary;

   Scanner input = new Scanner(System.in);

   System.out.print("Enter the salary : ");
   salary = input.nextInt();

   System.out.print("Enter the years of service : ");
   years = input.nextInt();

   if(years >= 5) {
    
    int bonus = (salary * 5)/100 ;
    int bonusamount = salary + bonus;
   
    System.out.println("Bonus Applicable");
    System.out.println("Bonus Amount : " +bonusamount);
   }

   else {
  
   System.out.println("Bonus not Applicable");
   System.out.println("Bonus Amount : " +salary);
  } 
}
}