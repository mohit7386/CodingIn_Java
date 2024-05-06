
//WAP to print the array elements in which you are taking the size of the array from the user...
import java.util.*;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // for taking input
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // for output
        System.out.println("These are the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }

}
