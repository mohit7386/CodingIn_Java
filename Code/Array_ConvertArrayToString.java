
//Convert array into the string format 
import java.util.*;

public class Array_ConvertArrayToString {
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
        // Arrays.toString function converted your array into the string format with in
        // square brackets
        System.out.println("Your Array Converted into the String with square brackets: " + Arrays.toString(arr));
        sc.close();
    }

}
