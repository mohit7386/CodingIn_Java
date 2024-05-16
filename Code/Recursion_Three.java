import java.util.*;

public class Recursion_Three {
    public static void printSum(int n, int limit, int sum) {
        if (n == limit) {
            sum = sum + n; // Yahan humne apne sum me add kiya hai last number ko bhi
            // aisa agar nahi
            // karenge to last number ka sum nhi ho paayega isiliye
            System.out.println(sum);

            return;
        }
        sum = sum + n; // yahan ye saare numbers ka sum karega then jab base case true hoga to base
                       // case me last mein jo number aaya hoga usko wo sum me add kr dega
        printSum(n + 1, limit, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit where you want to print the sum of natural number: ");
        int limit = sc.nextInt();
        int n = 1;
        int sum = 0;
        System.out.println("The sum of all the natural numbers from " + n + " to " + limit + " is: ");
        printSum(n, limit, sum);
        sc.close();
    }

}
