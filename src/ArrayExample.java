public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = new int[5]; // an array to hold 5 integers
        
        // Inserting elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Modifying elements
        numbers[2] = 35;
        System.out.println("Modified element at index 2: " + numbers[2]);

        // Length of the array
        System.out.println("Length of the array: " + numbers.length);

        // Iterating over the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using enhanced for loop (for-each)
        System.out.println("Elements of the array using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}