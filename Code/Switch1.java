
//here we are learning switch case how does it work and how we can code into the switch case.
import java.util.*;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press the button");
        int button = sc.nextInt();
        switch (button) { // here in bracket we use our variable name
            case 1: // switch has cases
                System.out.println("hello!"); // for printing the statement
                break; // break is used to terminate the case1 and exit the code...always use break
                       // after one statement
            case 2:
                System.out.println("Namaste!");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
            default: // this is the default case same as like an else case, so here you don't need to
                     // use break.
                System.out.println("You are pressing the wrong button!");
        }
        sc.close();
    }
}
