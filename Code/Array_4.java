
//Java automatically sets the default value when you are not giving the elements to the array..
import java.util.*;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int size = sc.nextInt(); // declare the integer variable 'size'
        int arr[] = new int[size]; // decalre the array with size variable
        for (int i = 0; i < size; i++) { // here we are not giving any elements to the array but uske bad bhi wo zero
                                         // print kara raha hai because of java has automatic intialisation of the
                                         // values if you are not giving any elenent to the array then array
                                         // automatically intialise all the elements with the zero (null) value.
            System.out.println(arr[i]);
        }
        sc.close();
    }

}
