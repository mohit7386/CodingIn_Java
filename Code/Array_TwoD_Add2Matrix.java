
//WAP to add two matrices
import java.util.*;

public class Array_TwoD_Add2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows for an array: ");
        int row = sc.nextInt();
        System.out.println("Enter the Columns for an array: ");
        int cols = sc.nextInt();
        System.out.print("Enter the elements in the  first matrix: ");
        int arr[][] = new int[row][cols];
        // Taking elements in the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the elements in the second matrix: ");
        int arr1[][] = new int[row][cols];
        // Taking elements in the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // Creating new matrix to store the sum of two matrices
        System.out.println("Addition of your two matrix is: ");
        int sum[][] = new int[row][cols];
        // Addition of two matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
    }

}
