import java.util.*;

public class Array_TwoDArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows for an array: ");
        int row = sc.nextInt();
        System.out.println("Enter the Columns for an array: ");
        int cols = sc.nextInt();
        System.out.print("Enter the elements in the 2D array: ");
        int arr[][] = new int[row][cols];
        // Taking elements in the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing the elements of the array
        System.out.println("Printing the elements of the array: ");
        // Here we are using Nested loops means loop inside loops
        for (int i = 0; i < row; i++) { // i runs till the size of the rows and ith loop is for row only and here when i
                                        // loop runs and starts from zero then we take input in the columns matlab ki
                                        // when i=0 then j runs for all the conditions like j=0,1,2....till the range of
                                        // the column
            for (int j = 0; j < cols; j++) { // j runs till the size of the columns and jth is for column only
                System.out.print(arr[i][j] + "  "); // Printing the elements of the array
            }
            System.out.println(); // here we are using because after satisfying one conditionand priting one row
                                  // then it moves the cursor to the next line
        }
        sc.close(); // here we are closing our scanner class
    }
}