
//Clear Bit example of a BitManipulation
import java.util.*;

public class BitManipulation_ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        int BitMask = 1 << pos;
        // For solving the clear Bit question so first you need to calculate the BitMask
        // then first calculate the NOT of BitMask Then Do - NOT of BitMask ka AND with
        // original number.
        int notbitmask = ~(BitMask);
        int newnumber = notbitmask & num;
        System.out.println("The cleared bit on the given position is: " + newnumber);
        sc.close();
    }
}