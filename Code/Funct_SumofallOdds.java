import java.util.*;

public class Funct_SumofallOdds {
    public static void sumOfAllOdds(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all odd numbers from 1 to " + num + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit where you want to print the sum of odd numbers");
        int number = sc.nextInt();
        sumOfAllOdds(number);
        sc.close();
    }

}
