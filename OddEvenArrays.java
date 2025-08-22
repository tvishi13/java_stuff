import java.util.Scanner; // Importing Scanner class for user input

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt(); // Store user input in the number variable
        
        if (number <= 0) { // Check if the number is a natural number
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit program
        }
        
        int[] evenNumbers = new int[number / 2 + 1]; // Array for even numbers
        int[] oddNumbers = new int[number / 2 + 1]; // Array for odd numbers
        int evenIndex = 0, oddIndex = 0; // Index variables for even and odd numbers
        
        // Loop to separate even and odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        // Print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
