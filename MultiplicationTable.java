import java.util.Scanner; // Importing Scanner class for user input

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt(); // Store user input in the number variable
        
        int[] table = new int[10]; // Define an array to store multiplication   results
        
        // Loop to calculate and store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        
        System.out.println("\nMultiplication Table for " + number + ":");
        // Loop to display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
