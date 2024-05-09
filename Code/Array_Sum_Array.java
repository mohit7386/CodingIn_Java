
//sum of all the elements in the array
import java.util.*;

public class Array_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        // taking elements in the array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements in the array: " + sum);
        sc.close();
    }
}