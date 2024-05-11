import java.util.*;

public class Strings_parseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in numerical: ");
        // here we are not using the parseInt method so because of scanner class it
        // takes the input as string ans print as it is whether it is numerical or
        // character it doesnot matter....but in the method of parseInt we are
        // converting numerical string to the integer here we need parseInt method to
        // convert the numerical string to the Integer value
        String name = sc.nextLine();
        // int Intergervalue = Integer.parseInt(name); // here when you give this string
        // - 7906318238 it exceeds the limit
        // of int because the limit value for the int in java is -
        // 2147483647 and because of your string it exceeds the limit so it
        // throws an error - NumberformatException so for preventing this
        // type of error we need to increase the limit by using the lomg in
        // place of int..
        System.out.println("Your String after converted into integer value: ");
        long Intergervalue = Long.parseLong(name);
        System.out.println(Intergervalue);
        sc.close();

    }
}