public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization
        int[][] matrix = new int[3][3]; // a 3x3 matrix
        
        // Inserting elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Accessing elements
        System.out.println("Element at row 0, column 0: " + matrix[0][0]);
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);
        
        // Modifying elements
        matrix[2][1] = 10;
        System.out.println("Modified element at row 2, column 1: " + matrix[2][1]);

        // Dimensions of the array
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns in row : " + matrix[0].length);

        // Iterating over the array using nested for loops
        System.out.println("Elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Using enhanced for loop (for-each)
        System.out.println("Elements of the matrix using enhanced for loop:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}