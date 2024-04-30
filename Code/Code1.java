import java.util.*; //import all the classes of java.util package which includes scanner class which helps to taking input.
public class Code1{

    public static void main (String[] args){ //this is our main function we can write our code into our main function
        int a = 34,b=45; //a and b are the variables which is like a container to store some value, and it can be changed.
        System.out.println("The value of a and b is:- "+a+","+b); //here with the help of this we can print our output...
        //scanner class helps to taking the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name:-");
        String name = sc.next(); //it reads only the next token (sequence of characters without spaces) and does not consume the newline character (\n)
        sc.nextLine(); //consumes new line character when using sc.next()..always use this when you are using the sc.next();
        System.out.println("Enter Your Full name");
        String name2 =sc.nextLine(); //Next line prints all the tokens
        //System.out.println(name);
        System.out.println("Enter Your Roll No:-");
        int c = sc.nextInt();
        System.out.println("Your First name is:- "+name);
        System.out.println("Your Full name is:- "+name2);
        System.out.println("Roll No:-"+c);

    }
}