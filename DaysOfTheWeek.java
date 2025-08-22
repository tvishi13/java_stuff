import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String[] args) {
        int m, y, d, y0, x, m0, d0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Type 1 for January");
		System.out.println("Type 2 for February and so on....");
        System.out.print("Enter month: ");
        m = sc.nextInt();
        System.out.print("Enter day: ");
        d = sc.nextInt();
        System.out.print("Enter year: ");
        y = sc.nextInt();        
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;    
        System.out.println("Day of the week (0=Sunday, 1=Monday, ... 6=Saturday): " + d0);

    }
}
