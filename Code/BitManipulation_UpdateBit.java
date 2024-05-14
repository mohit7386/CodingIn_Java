
//Update Bit means hum kisi bhi bit ko chahein to zero bana sakte hain aur kisi bhi bit ko chahein to 1 bana sakte hain
import java.util.*;

public class BitManipulation_UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice Whether you want to make bit 1 or 0? ");
        int choice = sc.nextInt();
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        int BitMask = 1 << pos;
        if (choice == 1) {
            // here for setting 1 inplace of 0 we always use Set Bit in which we use the OR
            // Operation
            // after
            // calculating the BitMask
            int newnumber = BitMask | num;
            System.out.println("After Updating Your bit will be: " + newnumber);
        } else {
            // here for clearing bit 1 then convert it into 0 then calculating bitmask then
            // calculating NOT of bitmask then do AND With NOT of Bitmask and the original
            // number
            int newBitMask = ~(BitMask);
            int secondnumber = newBitMask & num;
            System.out.println(
                    "After clearing the bit of the " + pos + " position and the decimal number will be: "
                            + secondnumber);
        }
        sc.close();

    }

}
