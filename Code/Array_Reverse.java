
//WAP to reverse the elements of an array
import java.util.*;

public class Array_Reverse {
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
        // Reverse of an array
        System.out.println("Reversed Array: ");
        for (int i = size - 1; i >= 0; i--) { // here we are starting from size-1 because array index starts from zero
                                              // to (n-1)
            System.out.print(arr[i] + "  ");
        }
        sc.close();
    }
}
