
//WAP To count the how many vowels and consonant in the given String also exclude the space in between 
import java.util.*;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) { // always use less than sign '<'
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
                    || name.charAt(i) == 'O' || name.charAt(i) == 'U') {
                count1++;
            } else if ((name.charAt(i) != 'a' || name.charAt(i) != 'e' || name.charAt(i) != 'i' || name.charAt(i) != 'o'
                    || name.charAt(i) != 'u' || name.charAt(i) != 'A' || name.charAt(i) != 'E' || name.charAt(i) != 'I'
                    || name.charAt(i) != 'O' || name.charAt(i) != 'U') && name.charAt(i) != ' ') {
                count2++;
            }

        }
        System.out.println("Total No. of Vowels in a String: " + count1);
        System.out.println("Total No. of Consonant in a String: " + count2);
        sc.close();
    }

}
