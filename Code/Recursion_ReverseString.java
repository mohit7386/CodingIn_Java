
//Reverse the String using recursion
import java.util.*;

public class Recursion_ReverseString {
    public static void PrintRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx)); // printing the each character present in the string..
        PrintRev(str, idx - 1); // it is used to decrementing the index to access the characters from the
                                // decrementing order until base case reach

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Reversed String: ");
        PrintRev(str, str.length() - 1); // str.length() - access the last character of the string..start the recursion
                                         // from the last character of the string...
        sc.close();
        // Time complexity of this code - O(n) where n is the length of the string. This
        // is because each recursive call processes one character of the string, and
        // there are n characters in total. Each character is printed exactly one.
        // Space Complexity is also - O(n)...

    }
}
