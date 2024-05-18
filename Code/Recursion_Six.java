
//Calculating the power of X^n so the logic is - first we calculate the x^(n-1) then multiply X so we got the power of the given number 
//Terminology is - when we multiply the X in the X^(n-1) then we got the X^n 
import java.util.*;

public class Recursion_Six {
    public static int Calculatepower(int base, int exponent) {
        if (exponent == 0) { // base 1 where power is 0 then return 1 because kisi bhi number ki power 0 ho
                             // to answer 1 hota hai
            return 1;
        }
        if (base == 0) { // aur jab base hi zero ho gaaya tb to power hi kiski nikalenge isiliye 0 return
                         // kar diyaa..
            return 0;
        }
        int Calculatenm1 = Calculatepower(base, exponent - 1); // Function ne call laga li khudko hi jisme power -1 ho
                                                               // gyi it means hum calculate kr rahe hain -1 then
                                                               // multiply kar denge apne power 1 se fr minus hoke hume
                                                               // Base^exponent mil jaayega
        int result1 = Calculatenm1 * base;
        return result1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        int power = Calculatepower(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + power);
        sc.close();
        // This program recursively calculates the power of any number

    }

}
