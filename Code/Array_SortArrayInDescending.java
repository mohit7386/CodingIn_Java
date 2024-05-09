
//Sort the array in descending order
import java.util.*;

public class Array_SortArrayInDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        // Taking elements in the array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Taking two loops one is for traversing each element in the array and another
        // one is comparing and checking the element
        for (int i = 0; i < size; i++) { // Starts from first element
            for (int j = i + 1; j < arr.length; j++) { // Starts from second element then compare with first element
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array of elements in descending order: ");
        System.out.println(Arrays.toString(arr) + " ");
        sc.close();
    }
}