
//Write the program to remove the white spaces in the given String 
import java.util.*;

public class Remove_WhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        String result = name.replace(" ", ""); // replace method replace all the occurences of the white spaces present
                                               // oin the string and " " - used to replace the white spaces and "" -This
                                               // is a replacement string. in this case we don't want to replace the
                                               // spaces with any of the character that's why we use empty character but
                                               // "S" - but when you write this then your spaces would replace with the
                                               // character 'S'..
        System.out.println("After Removing the spaces in between the String: " + result);
        sc.close();
    }

}
