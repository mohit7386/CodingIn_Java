import java.util.*;

public class Array_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        // Taking elements in the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0]; // Setting the first element in the array will be our largest element and
                          // compare this element to all the elements in the given array
        for (int i = 0; i < arr.length; i++) { // Iterating all the elements in the array and searching is there any
                                               // number greater than max which holds the value of first element
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the given array is: " + max);
        sc.close();
    }

}
