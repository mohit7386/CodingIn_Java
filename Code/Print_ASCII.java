
//Print the ASCII Values of the given characters entered by the user 
import java.util.*;

public class Print_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char character = sc.next().charAt(0); /*
                                               * scanner.next() is used to read the user input as a string, and
                                               * charAt(0) is used to extract the first character from that string and
                                               * convert it into a char.
                                               */
        System.out.println("ASCII Value of " + character + " is: " + (int) character); // Typecasting the characters
                                                                                       // into
                                                                                       // the integer
        // value
        sc.close();
    }

}
