import java.util.*;

public class Funct_SumOf2Numbers {
    public static int calculateSum(int a, int b) { // decleration of the fuction and declare the two integer variables
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // calculateSum(a, b);
        System.out.println("The Sum of " + a + " and " + b + " is:- " + calculateSum(a, b)); // calling and printing the
        // function
        sc.close();
    }
}
