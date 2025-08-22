  import java.util.Scanner; // Importing Scanner class for user input

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = scanner.nextInt(); // Store user input in the number variable
        
        int[] multiplicationResult = new int[4]; // Define an array to store multiplication results from 6 to 9
        
        // Loop to calculate and store multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        // Loop to display the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
