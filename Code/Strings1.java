import java.util.*;

public class Strings1 {
    public static void main(String[] args) {
        System.out.print("Enter Your First Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // So here when we use next then it will not take the string after the space so
                                 // that's why your full name is not printed
        sc.nextLine(); // ye isiliye lagaya kyuki sc.next() kewal ek token ko read krti hai space ke
                       // baad wo aage kuch bhi ho read hi nahi karti hai to usko aage ka bhi read
                       // karane ke liye humne use kiya hai sc.nextLine();
        System.out.println("Enter Your Full Name: ");
        String name2 = sc.nextLine();
        System.out.println("Your First Name: " + name);
        System.out.println("Your Full Name: " + name2);
        sc.close();
    }
}
