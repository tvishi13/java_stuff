import java.util.Scanner;
public class RocketLaunch {
    public static void main(String[] args) {
        int counter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        counter = sc.nextInt();

        while(counter >=1 ){
            System.out.println(counter);
            counter--;}
        System.out.println("Launch!!");
        
    }
}
