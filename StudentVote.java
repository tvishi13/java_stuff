import java.util.Scanner; // Importing Scanner class for user input

public class StudentVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        int[] ages = new int[10]; // Define an array to store ages of 10 students

        // Loop to take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); // Store user input in the array
        }

        System.out.println("\nVoting Eligibility Results:");
        // Loop through the array to check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age); // Handle negative age input
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}