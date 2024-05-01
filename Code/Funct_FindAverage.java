
//Program to find the average of 3 Numbers...
import java.util.*;

public class Funct_FindAverage {
    public static int findAverage(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a , b and c:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = findAverage(a, b, c);
        System.out.println("The average of " + a + " , " + b + " and " + c + " is:" + average);
        sc.close();
    }

}
