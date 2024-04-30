import java.util.*;

public class sum_ofN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // we cannot declare in the loop...always we decalare the variable after the
                     // Scanner class if we want to use it outside the loop
        System.out.println("Enter the limit where you want to print the sum of Natural Number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of Natural Numbers from:- " + sum);
        sc.close(); // this is a good practice always close the scanner class after your work is
                    // done..
    }

}
