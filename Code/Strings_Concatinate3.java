import java.util.*;

public class Strings_Concatinate3 {
    // @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1) {
            System.out.println("Wrong Choice! Pls Enter Number greater than zero..");
            sc.close();
            return;

        }
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        System.out.println(num + " " + name);
        sc.close();
    }
}
