import java.util.Scanner;
public class Friendcomp{
public static void main(String[] args) {
String[] names = {"Amar", "Akbar", "Anthony"};
int[] ages = new int[3];
double[] heights = new double[3];
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < 3; i++) {
System.out.println("Enter details for " + names[i] + ":");
System.out.print("Enter age: ");
while (!scanner.hasNextInt()) {
System.out.println("Invalid input");
scanner.next();
System.out.print("Enter age: ");
}
ages[i] = scanner.nextInt();
while (ages[i] < 0) {
System.out.println("Enter again: ");
ages[i] = scanner.nextInt();
}
System.out.print("Enter height (in cm): ");
while (!scanner.hasNextDouble()) {
System.out.println("Invalid input");
scanner.next();
System.out.print("Enter height: ");
}
heights[i] = scanner.nextDouble();
while (heights[i] < 0) {
System.out.println("Enter again: ");
heights[i] = scanner.nextDouble();
}
}
int youngestIndex = 0;
int tallestIndex = 0;
for (int i = 1; i < 3; i++) {
if (ages[i] < ages[youngestIndex]) {
youngestIndex = i;
}
if (heights[i] > heights[tallestIndex]) {
tallestIndex = i;
}
}
System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
scanner.close();
}
}
