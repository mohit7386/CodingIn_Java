import java.util.*;

public class Strings_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name1 = sc.nextLine();
        System.out.println("Enter a String: ");
        String name2 = sc.nextLine();
        // Three cases in the string are:-
        // 1- str==str1 -> gives 0
        // 2- str>str1 -> gives positive value
        // 3- str<str1 ->gives negative value
        // for greater and smaller value it checks all the characters then decide on the
        // basis of the characters equality
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal!");
        } else
            System.out.println("Strings are not equal!");
        sc.close();
    }

}
