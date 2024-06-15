
import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Print the numbers before swapping
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers without using a temporary variable
        num1 = num1 + num2; // Step 1
        num2 = num1 - num2; // Step 2
        num1 = num1 - num2; // Step 3

        // Print the numbers after swapping
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner to free up resources
        scanner.close();
    }
}
