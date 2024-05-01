
//write the program and print the numbers from 1 to user want then stop the loop when 24 comes
import java.util.*;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit where you want to print the even numbers: ");
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) { // saare numbers to loop ki help se aa rahe hain na to numbers ko ek ek krke
                              // check krne ke liye i lagayenge kyuki numbers to loop ki help se hi aa rhe
                              // hain
                System.out.println(i);
                if (i == 12) { // i ko compare karayenge agar wo 12 hota hai to loop break ho jaayega
                    System.out.println("Here your loop is break on " + i + " with the help of break keyword!");
                    break; // it breaks out of the loop and returns the control to the main body of the
                           // program.In case of nested loops it breaks the inner loop and control return
                           // to the outer loop
                }
            }
            sc.close();
        }
    }
}
