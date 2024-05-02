
//Program to find the total number of characters present into your string
import java.util.*;

public class String_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any quote you love the most!:");
        int count = 0;
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) { // run till the string length
            if (str.charAt(i) != ' ') { // checking all the characters from the string
                count++;
            }
        }
        System.out.println("The Total Number of Characters present in your string is: " + count);
        sc.close();

    }

}
