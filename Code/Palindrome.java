import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check for palindrme or not: ");
        int num = sc.nextInt();
        int sum = 0;
        int r;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Number is Palindrome!");
        } else
            System.out.println("Number is not Palindrome!");
        sc.close();
    }

}
