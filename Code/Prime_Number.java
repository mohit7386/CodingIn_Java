
//we are checking the number is prime or not - prime are those numbers which is divisible by 1 and itself
import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter any number for checking the number is prime or not");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) { // coding me humein kahin se leke kahin tak agar jaana hota hai to hum loops
                                         // use karte hain....putting the loop for traverse from 1 to number
            if (num % i == 0) // checking the conditon from num 1 to number when the value will be true then
                              // it increases the value of the counter
                count++;
        }
        if (count == 2) { // when counter is 2 because prime number is only divisible by two digits 1 and
                          // itself.
            System.out.println("Number is Prime Number");
        } else {
            System.out.println("Number is not a prime number");
        }
        sc.close();
    }

}
