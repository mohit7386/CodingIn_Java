
//Write the function to print my name
import java.util.*;

public class Functions_In_Java {
    public static void printMyName(String name) { // Decleration of a function and the function type is void
        System.out.println("Your Name:-");
        System.out.println(name); // printing the entered by the user
        return; // work is complete then we return to the main function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking input from the user
        System.out.println("Enter Your Name:-");
        String name = sc.nextLine(); // taking integer type input from the user
        printMyName(name); // Calling the function
        sc.close();
    }

}
