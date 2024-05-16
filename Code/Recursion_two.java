
//Printing numbers from 1 to the limit you are providing
import java.util.*;

public class Recursion_two {
    public static void printNumber(int num, int limit) {
        if (num == limit) {
            System.out.println(num); // last wala number print karane ke liye humne use
            // kiya hai ye print statement
            // kahan tak chalega limit jo hai wo print karane ke liye humne use kiya hai
            return;
        }
        System.out.println(num);
        printNumber(num + 1, limit); // function call itself
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.println("Numbers from 1 to the limit you are providing: ");
        printNumber(num, limit);
        sc.close();

    }

}
