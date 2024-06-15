
public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Bitwise Operators
        int m = 6;  // 0110 in binary
        int n = 3;  // 0011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n)); // Bitwise AND
        System.out.println("m | n: " + (m | n)); // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n)); // Bitwise XOR
        System.out.println("~m: " + (~m));       // Bitwise NOT
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift
        System.out.println("m >>> 1: " + (m >>> 1)); // Unsigned right shift

        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // Equivalent to c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // Equivalent to c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // Equivalent to c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // Equivalent to c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 2; // Equivalent to c = c % 2
        System.out.println("c %= 2: " + c);
    }
}