
import java.util.*;

public class Array_PrintEvenPosition_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // here we are talking about even position not the even index so that's why we
        // are stsrting our array from one..
        System.out.print("These are the elements present on the even position in an array: ");
        for (int i = 1; i < size; i = i + 2) {
            System.out.print(arr[i] + "  ");
        }
        sc.close();
    }

}
