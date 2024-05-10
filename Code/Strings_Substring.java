import java.util.*;

public class Strings_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int start_ind = sc.nextInt();
        int end_ind = sc.nextInt();
        String sentence = name.substring(start_ind, end_ind); // one important point is string ka jo last element hota
                                                              // hai wo position -1 hoti hai ek kam to agar substring
                                                              // print karate time iss baat ka dhiyaan rakhma hai ki
                                                              // last element bhi print karana hai to ek index position
                                                              // jayada likhenge....
        System.out.println(sentence);
        sc.close();
        // Strings are immutable we cannot change our string once it is declared and we
        // cannot modify it anykind of change is not acceptable once your string is
        // declared...
    }

}
