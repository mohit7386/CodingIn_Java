import java.util.*;

public class Strings_TotalLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Strings you want to enter: ");
        int size = sc.nextInt();
        // jab bhi kabhi bhi humein nextint , nextfloat , nextlong inn sabke baad
        // strings ka input lena hai ya strings ko hold karana hai to hum new line
        // character pehle consume karenge
        sc.nextLine();
        System.out.println("Enter " + size + " Strings: ");
        String arr[] = new String[size];
        int totallength = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
            totallength = totallength + arr[i].length();
        }
        System.out.println("The total length of your " + size + " Strings is: " + totallength);
        sc.close();
        {

        }

    }

}
