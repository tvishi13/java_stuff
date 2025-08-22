import java.util.Scanner; // Importing Scanner class for user input

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        double[] heights = new double[11]; //2
       Define an array to store heights of 11 players
        double sum = 0.0; // Variable to store the sum of heights
        
        System.out.println("Enter the heights of 11 football players:");
        
        // Loop to take input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble(); // Store user input in the array
            sum += heights[i]; // Add height to sum
        }
        
        double meanHeight = sum / heights.length; // Calculate mean height
        
        System.out.println("\nMean height of the football team: " + meanHeight);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
