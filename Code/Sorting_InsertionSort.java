
//Sorting using Insertion technique to sort the array
import java.util.*;

public class Sorting_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        // creating an array
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        // Enter the elements on each index position
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // traverse each element of the array
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
        System.out.println("After Sorting Your Array will be: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
