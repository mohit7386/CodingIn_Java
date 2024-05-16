
//for finding the factorial of any number we use this terminology - 5! = 5*4! means - n! * (n-1)!
import java.util.*;

public class Recursion_Four {
    public static int findFactorial(int num) {
        if (num == 1) {
            // System.out.println();
            return 1;
        }
        int calculate_factorial = num * findFactorial(num - 1); // function calling itself and multiplied with number
        return calculate_factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = findFactorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        sc.close();
    }
}