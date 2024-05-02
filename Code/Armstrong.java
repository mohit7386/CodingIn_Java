
//check whether the number is armstrong or not
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rem;
        int temp = num; // Original value of num transfered to the temporary variable temp
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("IsArmstrong number! ");
        } else
            System.out.println("Not a Armstrong Number!");
        sc.close();
    }

}
