import java.util.Scanner;

public class ScannerClassImplementation {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Read a string input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Read an integer input
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        
        // Read a double input
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Display the inputs
        System.out.println("You entered:");
        System.out.println("String: " + inputString);
        System.out.println("Integer: " + inputInt);
        System.out.println("Double: " + inputDouble);
    }
}