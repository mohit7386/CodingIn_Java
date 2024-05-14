
//BitManipulation - here we are using get bit function and perform AND Operation
import java.util.*;

public class BitManipulation_GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find the position: ");
        int n = sc.nextInt();
        System.out.println("Enter position which position of bit you want to search: ");
        int pos = sc.nextInt();
        int BitMask = 1 << pos;
        if ((BitMask & n) == 0) {
            System.out.println("Bit is zero");
        } else
            System.out.println("Bit is one");

        sc.close();
    }

}