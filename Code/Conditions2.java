import java.util.*;
public class Conditions2 {
    public static void main(String[] args){
        //Program to find the number is even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:-");
        int num=sc.nextInt();
        if(num%2==0){ //%- which is called modulo operator which gives us remainder so for this example num%2 = 17%2 = 16 and 1 is in remainder, so it checks the condition and 1 is not equal to zero then it is odd number.
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is odd");
    }
}
