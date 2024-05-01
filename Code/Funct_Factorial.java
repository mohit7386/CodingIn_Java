
//Program to find the factorial of a givwn number 
import java.util.*;

public class Funct_Factorial {
    public static void findFactorial(int number) {
        if (number < 0) {
            System.out.println("Invalid Number");
            return; // jahan par bhi hum return laga denge program wahin se return ho jaayega means
                    // wahin se terminate ho jaayega program aage kuch bhi code me check hi nahi
                    // karega but agar return nahi lagaya to aage bhi check krega aur values ko aage
                    // bhi print karega to beeter to use return.
        }
        int fact = 1; // fact setting to 1 because it multiplies with the i
        for (int i = 1; i <= number; i++) { // i ko one se leke number tak chalwa do
            fact = fact * i;
        }
        System.out.println("The factorial of " + number + " is:- " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for factorial:- ");
        int num = sc.nextInt();
        findFactorial(num);
        sc.close();
    }
}
