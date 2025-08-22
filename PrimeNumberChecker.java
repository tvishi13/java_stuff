import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if (number <= 1){
            System.out.println(number + " is not a Prime Number.");}
        else{
            boolean isPrime = true;
            for (int i = 2; i <= number-1; i++){
                if (number % i == 0) {
                    isPrime = false;
                    break;}}
            
            if (isPrime){
                System.out.println(number + " is a Prime Number.");}
            else{
                System.out.println(number + " is not a Prime Number.");}}
        
    }
}
