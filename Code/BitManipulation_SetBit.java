import java.util.*;

public class BitManipulation_SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the Position: ");
        int pos = sc.nextInt();
        int counter = 0;
        int BitMask = 1 << pos;
        int newnumber = BitMask | num;
        System.out.println("Your Bit is set in the given position: " + newnumber);

        // Count the total number of 1's in the binary representation of newnumber
        while (newnumber > 0) {
            counter += newnumber & 1; // for checking the each bit we always using the AND and for sum of the total
                                      // 1's in the binary data we use the sum + newnumber ke saath AND
            newnumber >>= 1; // Right shift to check the next bit =1 same as like another program we use
                             // increment operator to move to the next iteration..
        }

        System.out.println("Total No. Of 1's in the Binary Representation is: " + counter);

        sc.close();
    }
}
