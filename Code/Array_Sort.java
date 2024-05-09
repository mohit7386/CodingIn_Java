
//Sort the array
import java.util.*;

public class Array_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        // Taking elements in the array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // It's a method in java which helps to sort our array in ascending order
        System.out.println("After Sorting the elements of the array: ");
        System.out.println(Arrays.toString(arr) + " "); // Arrays.toString method is used to print the array in the
                                                        // string format with the separated commas and the square
                                                        // brackets and you don't need to use loop when you are using
                                                        // this function
        sc.close();
    }
}
