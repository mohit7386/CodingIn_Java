
//Progran to find how many times the given character is present in the string..
import java.util.*;

public class Recursion_findOccurences {
    public static int findOccurences(String str, int idx, char element, int count) {
        if (idx == str.length()) {
            return count; // when idx value is equal to the string length then return the value of the
                          // count kyuki string khatam ho chuki hai
        }
        if (str.charAt(idx) == element) {
            count++; // when element is found then increase the value of the count by 1 then check
                     // other values if these are also equal then increase the value of the count tab
                     // tak jab tak base case reach nahi ho jaata hai..
        }
        return findOccurences(str, idx + 1, element, count); // Recursively call the function for the next index...
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the alphabet which you want to search how many times present in the string: ");
        char element = sc.next().charAt(0);
        int totalcount = findOccurences(str, 0, element, 0); // here we are passing the values string , idx - which is 0
                                                             // , element which is taken from the user , and count -
                                                             // which is also 0...
        System.out.println("Total " + element + " characters present in the String is: " + totalcount);
        sc.close();
        // Time Complexity of this code is - O(n)....

    }

}
