
//find the first and last occurence of the given character in the given string...
import java.util.*;

public class Recursion_FindfirstandlastOccurence {
    // here we are declaring the first and last variable with static because ye fix
    // rahega aur memory me bar bar change nahi hoga statically whe using
    // recursion..
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(int idx, String str, char element) {
        if (idx == str.length()) { // base case ye jab tak index ki value str ki length ke equal nahi ho jaati hai
                                   // tab tak ye chalega
            System.out.println("First Occurence of the character " + element + " present on the index: " + first);
            System.out.println("Last Occurence of the character " + element + " present on the index: " + last);
            // yahan hum print karayenge dono ko first and last ko kyunki index to string
            // length tak chalega aur end tak har ek index pe check karega jo element ka
            // occurence find karna hai usko isiliye end tak chalega to print yahin
            // karayenge kyuki last tak check karana hai isiliye last waale occurence jo bhi
            // aayega usko print kara denge
            return;
        }
        char currentchar = str.charAt(idx); // taking the current character from the string..
        if (currentchar == element) { // checking the character in the string is equal to the character givem by the
                                      // user or not
            if (first == -1) { // if the value is true then only idx value is stored in the first variable
                first = idx; // agar if condition true ho gyi to to idx ko store kar dega first me aur first
                             // ki value update hoke new value ho jaayegi aur frse idx update hoke check
                             // karega fr ye false ho jaayegi to else me chali jayegi jisse ki last update ho
                             // jaayega aur tab tak update hoga jab tak outer if false nhi ho jaata
            } else {
                last = idx;
            }
        }
        findOccurence(idx + 1, str, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println(
                "Enter the character you want to find the first and last occurence of that character in the string: ");
        char element = sc.next().charAt(0);
        findOccurence(0, str, element);
        sc.close();
        // Time Complexity of this code is O(n) because the length of the string is n
        // times and function processes each character of the string is exactly once.

    }

}
