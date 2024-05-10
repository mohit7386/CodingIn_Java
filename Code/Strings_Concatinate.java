import java.util.*;

public class Strings_Concatinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String fname = sc.next();
        sc.nextLine(); // always put if you want to read more in the string after the
        // space then you
        // need to put this
        System.out.println("Enter Your Last Name: ");
        String lname = sc.nextLine();
        String Fullname = fname + " " + lname;
        System.out.println("Your Full name after concatination is: " + Fullname);
        sc.close();
    }
}
