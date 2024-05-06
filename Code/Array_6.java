
//Take an array as input from the user. search for x in the array 
import java.util.*;

public class Array_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // taking input from the user
        for (int i = 0; i < arr.length; i++) { // for traversing each element in the array
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number you want to search in the array: ");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.println("Index Position of number 'x' is: " + i); // i is for element position and arr[i] is
                                                                             // for array element
            }
        }
        sc.close();
    }

}
