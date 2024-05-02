import java.util.*;

public class Strings_Concatinate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String fname = sc.next();
        sc.nextLine();
        System.out.println("Enter Your Last Name: ");
        String lname = sc.nextLine();
        System.out.println(fname.concat(" " + lname)); // We can also use concat() method for concatinating two
                                                       // strings...
        sc.close();
    }
}
