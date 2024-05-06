import java.util.*;

public class Array_PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Names: ");
        String name[] = new String[size];
        // Taking input from the user
        for (int i = 0; i < size; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("***********Names are:*********** ");
        for (int i = 0; i < name.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + name[i]); // i+1 is for counting numbers in increment
                                                                        // order.
        }
        sc.close();
    }

}
