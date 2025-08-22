import java.util.Scanner;
import java.util.Arrays;
public class MaxDigit{
public static void main(String[] args) {
int maxDigit = 10;
int[] digits = new int[maxDigit];
int index = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();
while (number != 0) {
if (index == maxDigit) {
maxDigit += 10;
digits = Arrays.copyOf(digits, maxDigit);
}
digits[index] = number % 10;
number /= 10;
index++;
}
if (index == 0) {
System.out.println("No digits found in the number.");
return;
}
int largest = -1;
int secondLargest = -1;
for (int i = 0; i < index; i++) {
if (digits[i] > largest) {
secondLargest = largest;
largest = digits[i]; 
} else if (digits[i] > secondLargest && digits[i] != largest) {
secondLargest = digits[i];
}
}
System.out.println("Largest digit: " + largest);
System.out.println("Second largest digit: " + (secondLargest == -1? "Not available" : secondLargest));
scanner.close();
}
}
