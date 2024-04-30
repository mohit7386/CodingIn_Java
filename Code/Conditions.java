
//here we are learning conditional statements...
import java.util.*;

public class Conditions { // class name and file should be the same
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        // Conditional Statements - if else and if else if.
        if (age == 18) {
            System.out.println("You are an adult and you are eligible to vote!");
        } else if (age > 60 && age < 80) {
            System.out.println("You are a Senior Citizen!");
        } else if (age < 15) {
            System.out.println("You are a kid");
        } else {
            System.out.println("You are an adult!");
        }
        sc.close();
    }

}
