import java.util.*;

public class NumUserwant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0, count3 = 0;
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.print("Enter the number: "); // agar multiple numbers user se enter karwaane hain to loop ke
                                                    // andar input lelo numbers ko user se
            int num = sc.nextInt();
            if (num > 0) {
                count1++;

            } else if (num < 0) {
                count2++;

            } else if (num == 0) {
                count3++;

            } else {
                System.out.println("Invalid choice");
            }
        }
        System.out.println("*************************OUTPUT****************************");
        System.out.println("The total positive numbers are: " + count1);
        System.out.println("The total negative numbers are: " + count2);
        System.out.println("Total Zero numbers: " + count3);
        sc.close();
    }
}
