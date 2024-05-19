
//Here is the tower of hanoi problem using recursion in which no. 1 disk is on top and 2nd is below the 1 and so on...
//Rules: 
//1- you can only transfer one disk at a time
//2- smaller disk is placed always on the top  
import java.util.*;

public class Recursion_TowerOfHanoi {
    public static void movedisk(int num, char source, char helper, char destination) {
        if (num == 1) { // agar user ek hi disk enter karta hai tab to ek disk hai to aaram se usko
                        // source se destination pe transfer kardo simple...
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // for n-1 disk ke liye jo first disk ke upar hain usko source se helper tak
        // pahuchana hai uske liye destination ko helper banana hoga aur helper ko
        // destination
        movedisk(num - 1, source, destination, helper);
        System.out.println("Move disk " + num + " from " + source + " to " + destination);
        // now ab n-1 saari disk aa gayin helper pe ab source ko helper use karke
        // destination par pahuchana hai
        movedisk(num - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of disk you want to transfer: ");
        int num = sc.nextInt();
        movedisk(num, 'A', 'B', 'C');
        sc.close();
    }

}
