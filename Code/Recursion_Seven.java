
//Recursion calculating the power of any number with stack height (log n)
import java.util.*;

public class Recursion_Seven {
    public static int printPower(int x, int n) {
        if (n == 0) { // base case
            return 1;
        }
        if (n % 2 == 0) { // When power is even
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else { // when power is odd
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int x = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int n = sc.nextInt();
        int output = printPower(x, n);
        System.out.println(+x + " raised to the power " + n + " is: " + output);
        sc.close();
        // Time Complexity = log n - which is optimised time complexity for this
        // question and we are using the Exponentiation by squaring mwthod in which we
        // are halfing the powers to reduce the recursive calls and optimise the
        // complexity of our code
    }
}
