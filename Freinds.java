import java.util.Scanner;
 public class Freinds {
  public static void main(String[] args) {

   int age1 , age2 , age3 ;
   double height1 , height2 , height3 ;

   Scanner input = new Scanner(System.in);
 
   System.out.print("Age of Amar : ");
   age1 = input.nextInt();

   System.out.print("Age of Akbar : ");
   age2 = input.nextInt();
   
   System.out.print("Age of Anthony : ");
   age3 = input.nextInt();

   System.out.print("Height of Amar : ");
   height1 = input.nextDouble();

   System.out.print("Height of Akbar : ");
   height2 = input.nextDouble();

   System.out.print("Height of Anthony : ");
   height3 = input.nextDouble();

   if(age1 < age2 && age1 < age3) {
     System.out.println("Amar is youngest");
   }

   else if(age2 < age1 && age2 < age3) {
     System.out.println("Akbar is youngest");
   }

   else{
     System.out.println("Anthony is youngest");
   }
  
  if(height1 > height2 && height1 > height3) {
    System.out.println("Amar is tallest");
  }

  else if(height2 > height1 && height2 > height3) {
    System.out.println("Akbar is tallest");
  }

  else {
    System.out.println("Anthony is tallest");
  }
 }
}

