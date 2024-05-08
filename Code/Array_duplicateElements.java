import java.util.*;

public class Array_duplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[size];
        // Taking array elements
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // Searching for Duplicate elements
        System.out.println("Duplicate elements in the array are: ");
        for (int i = 0; i < size; i++) { // agar hum second loop nahi lagayenge to ye khudse hi check karta rahega
            for (int j = i + 1; j < arr.length; j++) { // yahan pe humne doosra array liya hai kyuki doosre element ko
                                                       // target kar sakein compare kar sakein duplicasy check karne ke
                                                       // liye because the logic is we need to compare the first element
                                                       // and second element of an array so isiliye humne wahan pe
                                                       // second loop liya hai array ke second element ko compare karne
                                                       // ke liye aur i+1 isliye liya hai kyuki second elememt ko choose
                                                       // karega ye that's why we are taking the i+1....ith loop
                                                       // captures the first element and jth loop captures the second
                                                       // element of an array..
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        sc.close();
    }

}
