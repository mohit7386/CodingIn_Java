
//Program to copy all elements of an array to another
import java.util.*;

public class Array_Copyto_secondarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        int arr2[] = new int[arr.length];
        // Taking input in the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Original Array");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        // Copying array elements to array1
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }
        // Displaying elements of array 2
        System.out.println("Second Array with the elements of the first array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
