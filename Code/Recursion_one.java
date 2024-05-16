
//here we are printing the number in decrement order till the user wants by using recursion----
import java.util.*;

public class Recursion_one {
    public static void printNum(int n) {
        if (n == 0) { // here is our base case in which we are defining the compiler where to stop in
                      // this case we need to stop on 0.
            return;
        }
        System.out.println(n);
        printNum(n - 1); // here function call itself with 'n-1' where every recursive call 1 is
                         // decreases till 0 and jab bhi recursion ho rahi hogi to jo recursive calls
                         // hoti hain wo stacks ki form me stored hoti hain memory mein like ek ke upar
                         // ek..
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }

}
