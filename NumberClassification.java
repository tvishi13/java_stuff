import java.util.Scanner; // Importing Scanner class for user input

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int[] numbers = new int[5]; // Define an array to store 5 numbers

        // Loop to take input for each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Store user input in the array
        }

        System.out.println("\nNumber Classification Results:");
        // Loop through the array to check conditions
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Compare the first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.println("\nComparison of first and last element:");
        if (first > last) {
            System.out.println("The first number (" + first + ") is greater than the last number (" + last + ").");
        } else if (first < last) {
            System.out.println("The first number (" + first + ") is less than the last number (" + last + ").");
        } else {
            System.out.println("The first number (" + first + ") is equal to the last number (" + last + ").");
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
