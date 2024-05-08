import java.util.*;

public class Array_PrintEven_Elements {
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
        // printing the even elements of the array
        System.out.println("Printing the even elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "  ");
            }
        }
        sc.close();
    }

}
