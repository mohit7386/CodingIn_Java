
//Replace the character using stringbuilder class and taking a string from the user 
import java.util.*;

public class Strings_Replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which includes the letter e then I will replace e with i: ");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'i');
            }
        }

        System.out.println("New String after replace the letter e with the letter i in your string! is: " + sb);
        sc.close();
    }

}
