import java.util.*;

public class Strings_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email Address: ");
        String email = sc.next();
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            char currentchar = email.charAt(i); // email.charAt(i) This allows you to iterate through each character of
                                                // the email string and we need to store the email to the char because
                                                // character.isdidgit taking char value so we need to convert the string
                                                // value to the char value..
            if (currentchar == '@' || Character.isDigit(currentchar)) {
                break;
            } else
                username = username + email.charAt(i);
        }
        System.out.println("Your email after removing numbers and @: " + username);
        sc.close();
    }

}
