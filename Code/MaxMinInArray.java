import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // 0th position pe available number ko max or min bana do aur baaki bache
        // numbers pe traverse karke compare kar lo ki isse koi badha hoga to print kar
        // de

        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE represents the smallest possible integer value that can be
                                     // stored in a variable in Java, which is -2,147,483,648.
        int min = Integer.MAX_VALUE; // Integer.MAX_VALUE represents the largest possible integer value that can be
                                     // stored in a variable in Java, which is 2,147,483,647.

        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

        scanner.close();
    }
}
