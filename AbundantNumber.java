import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for the abundant number: ");
        number = sc.nextInt();
        
        for (int i=1; i<number; i++){
            if (number%i==0){
                sum+=i;}}
        System.out.println("The sum of the divisors is: " + sum);
        if (sum>number){
            System.out.println("The number is a Abundant Number.");}
        else{
            System.out.println("The number is not a Abundant Number.");}
    }
}

