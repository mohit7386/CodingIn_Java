import java.util.*;

public class Strings_Replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String which includes the letter e then I will replace e with i: ");
        String chars = sc.nextLine();
        String emp_String = "";
        for (int i = 0; i < chars.length(); i++) {
            if (chars.charAt(i) == 'e') {
                emp_String = emp_String + 'i';
            } else
                emp_String = emp_String + chars.charAt(i);

        }
        System.out.println("New String after replace the letter e in your string! is: " + emp_String);
        sc.close();
    }

}
