import java.util.*;

public class Array_NoOfElemIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // For count the length of an array or we can say that count the no. of elements
        // in an array
        System.out.println("Total No. Of elements present in the array: " + arr.length);
        sc.close();
    }

}
