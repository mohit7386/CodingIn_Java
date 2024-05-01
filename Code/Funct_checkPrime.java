import java.util.*;

public class Funct_checkPrime {
    public static void checkIsPrimeOrNot(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("IsPrime");
        } else
            System.out.println("NotPrime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkIsPrimeOrNot(num); // calling function me jo result me value jaati hai wo main function
                                // se jaati hai or isko direct aise hi likh denge print karane ki jarurat nahi
                                // hai kyuki upr to print kra rakha hai
        sc.close();
    }

}
