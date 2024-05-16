import java.util.*;

public class Recursion_Five {
    public static int Calculate_fibo(int num) {
        // Base Case
        if (num == 0 || num == 1) {
            return num;
        }
        // Recursive Case
        int first_term = Calculate_fibo(num - 1);
        int second_term = Calculate_fibo(num - 2);
        int fibonacci = first_term + second_term;
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want fibonacci: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci number of your " + num + "th term is: " + Calculate_fibo(num - 1));
        System.out.println("Fibonacci Series from 0 to " + num + "th term is: ");
        for (int i = 0; i < num; i++) {
            System.out.println(Calculate_fibo(i));
        }

        sc.close();
    }

}
