import java.util.*;

public class Funct_Mul_2Numbers {
    public static int multiplyNumbers(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The multiplication of " + a + " and " + b + " is:- " + multiplyNumbers(a, b));
        sc.close();
    }
}
