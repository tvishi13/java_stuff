import java.util.Scanner; // Importing Scanner class for user input

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number to find its factors: ");
       
        int number = scanner.nextInt(); // Store user input in the number variable
        
        if (number <= 0) { // Check if the number is a natural number
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit program
        }
        
        int maxFactor = 10; // Initial array size
        int[] factors = new int[maxFactor]; // Array to store factors 
        int index = 0; // Index variable for array
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) { // Resize array if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Store factor
            }
        }
        
        // Print factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
