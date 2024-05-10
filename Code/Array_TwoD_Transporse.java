
//Write the program for creating the rtransporse of a matrix 
import java.util.*;

public class Array_TwoD_Transporse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want in the matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter how many columns you want in the matrix: ");
        int col = sc.nextInt();
        // Creating 2D array
        System.out.println("Enter the elements in the matrix: ");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // transporse of a matrix
        System.out.println("Transporse of a matrix is: ");
        // transporse nikalne ke liye row ko column bana do aur column ko row bna do
        // means ki transporse nikalte samay hum column ko pehle print kara dein aur row
        // ko baad ke print kara dein
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }

}
