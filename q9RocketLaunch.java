import java.util.Scanner;

public class q9RocketLaunch {
    public static void main(String[] args) {
        int counter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        counter = sc.nextInt();

        for (int i = counter; i >= 1; i--){
            System.out.println(i);}
        System.out.println("Launch!!");
     }
}
