
//Write the program for reverse the number 
import java.util.*;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to reverse: ");
        int num = sc.nextInt();
        int remainder;
        int reverse = 0;
        while (num != 0) {
            remainder = num % 10; // firstly we need to calculate the remainder of the number
            reverse = reverse * 10 + remainder; // second step will be we need to multiply 10 into the reverse and plus
                                                // the remainder
            num = num / 10; // Divide the number by 10
        }
        System.out.println("Your Reversed Number: " + reverse);
        sc.close();

    }

}
