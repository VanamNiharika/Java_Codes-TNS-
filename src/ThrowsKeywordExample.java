public class ThrowsKeywordExample {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will cause an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method that divides two numbers and declares that it throws an ArithmeticException
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}