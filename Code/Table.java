
//Program to print the table of any number
import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which table you want");
        int num = sc.nextInt();
        int table;
        System.out.println("Table of " + num + " is:- ");
        for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.println(+num + " * " + i + " = " + table);
        }
        sc.close();
    }
}
