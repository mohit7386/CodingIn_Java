
//Check if an array is sorted (Strictly Increasing) - strictly increasing means -{1,2,3,4,5,6} Not Strictly increasing means sorted but not in increasing strictly - {1,2,3,4,5,5,5,6} - there is no repeat in the numbers
import java.util.*;

public class Recursion_SortedArray {
    public static boolean checkArray(int arr[], int idx1) {
        if (idx1 == arr.length - 1) {
            return true;
        }
        if (arr[idx1] >= arr[(idx1 + 1)]) {// array is unsorted
            return false;
        }
        return checkArray(arr, idx1 + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkArray(arr, 0));
        sc.close();
        // Time Complexity of this code is - O(n)
    }
}
