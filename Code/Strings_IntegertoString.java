import java.util.*;

public class Strings_IntegertoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = sc.nextLong();
        // when you use sc.nextLine(), it reads the input until it encounters a newline
        // character, but it leaves the newline character in the input buffer. This
        // newline character represents the "Enter" key that the user presses after
        // inputting the value.
        // So, when you subsequently call sc.nextLine() again, it sees the newline
        // character left in the buffer from the previous input and thinks that the user
        // has entered an empty line. As a result, it consumes this newline character
        // and returns an empty string.
        sc.nextLine();
        String str = Long.toString(number);
        System.out.println("Your Integer value is converted into String: " + str);
        System.out.println("So your Converted String is printed character by character: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("Enter your full name in lowercase letters then it converts into uppercase letters: ");
        String name = sc.nextLine();
        System.out.println("Your Name in Uppercase: " + name.toUpperCase());

        sc.close();

    }

}
