import java.util.Scanner;
public class 	DigitCounter {
    public static void main(String[] args) {
        int number;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if (number==0){
            count = 1;}
        else{
            while (number != 0){
                number /= 10; 
                count++;}}
        System.out.println("The number of digits are: " + count);
        
   }
}

