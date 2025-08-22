import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        
        if (year < 1582) {
            System.out.println("Enter years after 1582 only!");}
        else {

            //METHOD-1
            System.out.println("Using multiple if-else statements...");
            if (year % 400 == 0){
                System.out.println(year + " is a Leap Year.");}
            else if (year % 100 == 0){
                System.out.println(year + " is not a Leap Year.");}
            else if (year % 4 == 0){
                System.out.println(year + " is a Leap Year.");}
            else{
                System.out.println(year + " is not a Leap Year.");}
           
            //METHOD-2
            System.out.println("Using single if statement and logical operators...");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a Leap Year.");}
            else{
                System.out.println(year + " is not a Leap Year.");}}
            
     }
}
