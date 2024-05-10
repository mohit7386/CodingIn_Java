import java.util.*;

public class Array_TwoD_Multiply2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of first matrix: ");
        int row1 = sc.nextInt();
        System.out.println("Enter the columns of first matrix: ");
        int col1 = sc.nextInt();
        System.out.println("Enter the rows of second matrix: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the columns of second matrix: ");
        int col2 = sc.nextInt();
        // Crearing a 2D array for first matrix
        int arr1[][] = new int[row1][col1];
        // taking elements in the first matrix
        System.out.println("Enter the elements in the first matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // Crearing a 2D array for second matrix
        int arr2[][] = new int[row2][col2];
        // taking elements in the first matrix
        System.out.println("Enter the elements in the second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        // Printing your first matrix
        System.out.println("Your First Matrix is:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }

        // Printing your second matrix
        System.out.println("Your Second matrix is: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }
        if (row1 != col2) {
            System.out.println("Matrix multiplication is not possible! row and cols need to be in same size");
        }
        // Creating another 2D Array for storing the multiplication of two matrix
        int result[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = 0; // Setting the new array to zero for storing the result of the two matrix
                                  // init....
                for (int k = 0; k < col1; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        } // printing the multiplication of the matrix--
        System.out.println("matrix Multiplication: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }

}
