import java.util.Scanner; // Importing Scanner class for user input

public class NumberStorageAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        double[] numbers = new double[10]; // Define an array to store up to 10 numbers
        double total = 0.0; // Variable to store the sum of numbers
        int index = 0; // Index to track the number of elements stored

        System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop):");
        
        // Infinite loop to take user input until conditions break it
        while (true) {
            System.out.print("Enter number: ");
            double num = scanner.nextDouble();
            
            if (num <= 0) { // Check if the user entered 0 or a negative number
                break;
            }
            
            if (index == 10) { // Stop taking input if array limit is reached
                break;
            }
            
            numbers[index] = num; // Store the number in the array
            index++; // Increment index
        }
        
        System.out.println("\nNumbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " "); // Display all stored numbers
            total += numbers[i]; // Add each number to total
        }
        
        System.out.println("\nTotal Sum: " + total); // Display the sum of all numbers
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
