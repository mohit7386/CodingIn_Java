import java.util.*;

public class Array_sumOf_TwoArrays {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int i, j;
        int size = sc.nextInt();
        System.out.println("Enter the elements in the first array: ");
        int arr1[] = new int[size]; // Corrected variable name
        // Taking elements in the first array from the user
        for (i = 0; i < size; i++) {
            arr1[i] = sc.nextInt(); // Corrected array name
        }
        // Taking elements in the second array from the user
        System.out.println("Enter the elements in the second array: ");
        int arr2[] = new int[size]; // Corrected array size
        for (j = 0; j < size; j++) { // Corrected loop condition
            arr2[j] = sc.nextInt(); // Corrected array name
        }
        // Storing the sum of the two arrays in the new array3
        int sum[] = new int[size];
        for (int k = 0; k < size; k++) { // Loop to calculate sum of elements
            sum[k] = arr1[k] + arr2[k]; // Corrected sum calculation

            System.out.println("The sum of elements in both array is: " + sum[k]);
        }
        sc.close(); // Close the Scanner object
    }
}
