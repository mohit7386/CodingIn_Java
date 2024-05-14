What is Java? 

Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language. Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java. Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform. 

Java Example Let's have a quick look at Java programming example. A detailed description of Hello Java example is available in next page. 
Simple.java 
class Simple{ 
    public static void main(String args[]){ //public and static both are keywords in java and keywords are the reserved words. 
         System.out.println("Hello Java");
          } 
          } 
          Test it Now Application According to Sun, 3 billion devices run Java. There are many devices where Java is currently used. Some of them are as follows: Desktop Applications such as acrobat reader, media player, antivirus, etc. Web Applications such as irctc.co.in, javatpoint.com, etc. Enterprise Applications such as banking applications. Mobile Embedded System Smart Card Robotics Games, etc. 
          ---------------------------------------------------------------------- 
          Types of Java Applications There are mainly 4 types of applications that can be created using Java programming: 
          1) Standalone Application Standalone applications are also known as desktop applications or window-based applications. These are traditional software that we need to install on every machine. Examples of standalone application are Media player, antivirus, etc. AWT and Swing are used in Java for creating standalone applications. 
          
          2) Web Application An application that runs on the server side and creates a dynamic page is called a web application. Currently, Servlet, JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web applications in Java. 
          
          3) Enterprise Application An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise applications. 
          
          4) Mobile Application An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are used for creating mobile applications. Java Platforms / Editions There are 4 platforms or editions of Java: 
          
          1) Java SE (Java Standard Edition) It is a Java programming platform. It includes Java programming APIs such as java.lang, java.io, java.net, java.util, java.sql, java.math etc. It includes core topics like OOPs, String, Regex, Exception, Inner classes, Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc. 
          
          2) Java EE (Java Enterprise Edition) It is an enterprise platform that is mainly used to develop web and enterprise applications. It is built on top of the Java SE platform. It includes topics like Servlet, JSP, Web Services, EJB, JPA, etc. 
          
          3) Java ME (Java Micro Edition) It is a micro platform that is dedicated to mobile applications. 
          
          4) JavaFX It is used to develop rich internet applications. It uses a lightweight user interface API. 
          
          ------------------------------------------------------------------------ 
          
          Prerequisite To learn Java, you must have the basic knowledge of C/C++ programming language. -------------------------------------------------------------------------------------------------------------------------------- Java is a platform independent language because the code of java write once and run everywhere. 
          
          Let's explain terminology:- Compilation Process:- Compiler(JDK) is a translator which converts the human readbale code into the machine code so compiler converts our source code(.java) into the byte code(.class)...So because of this functionality we can run the java code in any of the system which has JRE means JDK installed on his computer...so that's why java is portable language we can run our apps which is actually made by java in any of the systems. 
          
          Execution Process:- So Our Byte code then finally convert into the native code(machine readable code - Binary code) through JVM. JDK -> JRE + Development Tools -> JRE -> JVM + Libraries ---------------------------------------------------------------------------------------------------------------------------- Variable is a container which is used to store some value. 
          ex- a=3; , b=5; , c=7; -> a , b and c are the variables which is used to store some values and these values are not constants it can be changed.. -----------------------------------------------------------------------------------------------------------------------------Data Types :- 
          1- Primitive 
          2- Non-primitive 
          
          Primitive Data Types:- 
          1 byte = 8 Bits 
          short- size - 2 byte 
          int-size- 4 byte...It is taking integer type values 
          long-size- 8 byte...It is taking the long integer values 
          float-size - 4 byte...It is taking the floating point values means decimal values 
          double-size- 8 byte...It is also taking the floating point values 
          char- 1 byte - taking Characters 
          byte- 1 byte = 8 bits 
          boolean- 1 byte True or false 
          
          Non-primitive Data types:- 
          String- 
          Array- 
          Class- 
          Object- 
          Interface- =============================================================================================================================In Coding there is no BODMAS here is priority of the operators:- (),*,/,%,-,+  -> So first priority will be parenthesis then multiply divide and so on...and our calculation will be go on left to right.. 
          
          -------------------------------------------------------------------------------------------------------- 
          Taking input from the user -
          first import package where scanner class is present 
          import java.util.*;
          Scanner sc=new Scanner(System.in); //this is used to taking input 
          int a=sc.nextInt(); //this belongs to which type of input you want..here I want integer type input
          ------------------------------------------------------------------------------------------------------------------------
          Loops:- Or we can say that Iterators.
          If we want something happen again n again then we use loops.

          Types:- 

          1- for loop - 
          for(initialisation; condition; incre/decrement){}
          
          2- while loop - 
           intialiation;
           while(check cond.){
            print something;
            increment/decrement;
           }
          3- do while loop - 
          initialisation;
          do{
            print something;
            increment/decrement;
          }while(check cond.); //here in do while loop we always use terminator in the end of the while 
--------------------------------------------------------------------------------------------------------------------------
break statement

In java, break statement is used when working with any kind of a loop or a switch statement. It breaks out of the loop or a switch statement and returns the control to the main body of the program. In the case of nested loops, it breaks the inner loop and control is returned to the outer loop.

Note- 
In Java, the break statement is used to exit from loops (like for, while, or do-while loops) or switch statements. It is not used to exit from the main method directly.

Example:

public class JavaBreak {
    public static void main(String[] args) {
        for(int n=1; n<=20; n++) {
            if(n%2 == 0) {
                System.out.println(n);
                if (n == 12) {
                    break;
                }
            }
        }
    }
}
 

Output:

2
4
6
8
10
12
 

continue statement
The continue statement breaks the current iteration in the loop, and continues with the next iteration in the loop...

Example:

public class JavaContinue {
    public static void main(String[] args) {
        for(int n=1; n<=20; n++) {
            if(n%2 == 0) {
                if (n == 12) {
                    continue;
                }
                System.out.println(n);
            }
        }
    }
}
 

Output:

2
4
6
8
10
14
16
18
20
-----------------------------------------------------------------------------------------------------------------------------------
String Basics:-

Strings in java is a sequence of characters that Is enclosed in double quotes. Whenever java comes across a String literal in the code, it creates a string literal with the value of string.

Example:

public class string {
    public static void main(String[] args) {
        String name;
        name = "Diablo";
        System.out.println("My name is " + name);
    }
}
Output:

My name is Diablo
 

The same can be done using an array of characters.

Example:

public class string {
    public static void main(String[] args) {
        char[] name = {'D', 'i', 'a', 'b', 'l', 'o'};
        String welcomeMsg = new String(name);  
        System.out.println("Welcome " + welcomeMsg);
    }
}
Output:

Welcome Diablo
 

Concatenate Strings:
Concatenation between two strings in java is done using the + operator.

Example:

public class string {
    public static void main(String[] args) {
        String fname, lname;
        fname = "Diablo";
        lname = "Ramirez";
        System.out.println(fname + " " + lname);
    }
}
Output:

Diablo Ramirez
 

Alternatively, we can use the concat() method to concatenate two strings.

Example:

public class string {
    public static void main(String[] args) {
        String fname, lname;
        fname = "Diablo";
        lname = " Ramirez";
        System.out.println(fname.concat(lname));
    }
}
Output:

Diablo Ramirez
 

What if we concatenate string with an integer?

Well concatenating a string and an integer will give us a string.

Example:

public class string {
    public static void main(String[] args) {
        String name;
        int quantity;
        quantity = 12;
        name = " Apples";
        System.out.println(quantity + name);
    }
}
Output:

12 Apples

String Methods
 

Here we will see some of the popular methods we can use with strings.

 

length(): This method is used to find the length of a string.

Example:

public class string {
    public static void main(String[] args) {
        String quote = "To be or not to be";
        System.out.println(quote.length());
    }
}
Output:

18
 

indexOf(): This method returns the first occurrence of a specified character or text in a string.

Example:

public class string {
    public static void main(String[] args) {
        String quote = "To be or not to be";
        System.out.println(quote.indexOf("be"));    //index of text
        System.out.println(quote.indexOf("r"));     //index of character
    }
}
Output:

3
7
 

toLowerCase(): Converts string to lower case characters.

Example:

public class string {
    public static void main(String[] args) {
        String quote = "THOR: Love and Thunder";
        System.out.println(quote.toLowerCase()); 
    }
}
Output:

thor: love and thunder
 

toUpperCase(): Converts string to upper case characters.

Example:

public class string {
    public static void main(String[] args) {
        String quote = "THOR: Love and Thunder"  
        System.out.println(quote.toUpperCase());     
    }
}
Output:

THOR: LOVE AND THUNDER
---------------------------------------------------------------------------------------------------------------------------

          Functions and Methods :- 

          Function - function is a peace of code which takes input from the user and perform some operation and then produce output..
          
          SYNTAX - returnType functionName(type arg1, type arg2, type arg3....){ //here returnType would be anything like - int , float , string , void etc..It means which type of function you want to create. we can pass multiple arguments in one function and we can also pass different types of arguments in our function.
            //perform some operations and print something...
          } 
          
          Note:- One thing kept in mind in java function can return one type of value at a time..it means if we are creating integer type function then it can only return integer type value....

Sample program - 
//Write the function to print my name
import java.util.*;

public class Functions_In_Java {
    public static void printMyName(String name) { // Decleration of a function and the function type is void
        System.out.println("Your Name:-");
        System.out.println(name); // printing the entered by the user
        return; // work is complete then we return to the main function
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking input from the user
        System.out.println("Enter Your Name:-");
        String name = sc.nextLine(); // taking integer type input from the user
        printMyName(name); // Calling the function
        sc.close();
    }

}
Methods :- Functions and methods both are same formarily there is a minor difference between these which is we can call functions directly and methods are called by the objects of the class are called methods..
------------------------------------------------------------------------------------------------------------------------------
Operators :- 
 
Unary Operator, 
Arithmetic Operator, -> +,-,/,*
Shift Operator, -> >> <<
Relational Operator, -> <= , >= , == , != 
Bitwise Operator, -> 
                      Bitwise AND -> & -> it checks both the condition whether it is true or false.
                      Bitwise exclusive OR -> ^ -> it checks both the condition whether it is true or false.
                      Bitwise inclusive OR -> | -> it checks both the condition whether it is true or false.

Logical Operator, -> 
                      Logical AND -> && - need to both the conditions to be true if any one of the conditions are false then this will not check the second condition..
                      Logical OR -> || - running if only one value should be true it does not check the second condition when first condition will be true if the first condition is false then only it checks the another condition..

Ternary Operator -> ?: -> (a<b)?a:b; ->Ternary Syntax
Assignment Operator. -> a=b; here equal to sign is our assignment operator it's execution is right to left.
-------------------------------------------------------------------------------------------------------------------------------
Time Complexity:- 
Relation Between Input Size and Running Time(Operations).
-------------------------------------------------------------------------------------------------------------------------------
Arrays :- 

Colleection of items of the same data type in contigous(continuous) memory location  or we can say that list of items of the same data type...

Benefit to the array:- 
1- we can store the multiple numbers as much as you want which all are the same data type in contiguous memory location..
2- We can access any element very fast with their respective index.
3- Arrays can be used to store various types of data, including integers, floats, characters, or even custom objects, providing flexibility in programming.
4- Arrays support common operations such as sorting, searching, and manipulation of elements, enabling efficient data processing.

Defining an array :- 
type[] arrayName = new type[size]; //decleration of the array and here new is the keyword which is used to take the space in the memory which describes ki you are creating the new keyword and you want space in the memory through the non-primitive data type...

example - int[] marks=new int[3]; and the indexing in array starts from zero to (n-1) so the first element position will be start from zero and last element position will be n-1.
So, here we have 3 elements in the array and we want to access the first element then we write as - 
arrayName[index location]; = marks[0]; and so on for other array elements.....,
====================================================================================================================================
2D Arrays :- 

A 2D array in Java is an array of arrays, meaning it's an array where each element is itself an array. This allows you to represent data in a grid-like structure with rows and columns.

Initializing a 2D Array:
You can initialize a 2D array in Java using the following syntax:

java
Copy code
// Syntax for initializing a 2D array with specific values:
dataType[][] arrayName = {
    {val00, val01, ..., val0N},
    {val10, val11, ..., val1N},
    ...,
    {valM0, valM1, ..., valMN}
};

// Example:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Accessing Elements of a 2D Array:
You can access elements of a 2D array using row and column indices. Remember that indices in Java start from 0.

java
Copy code
// Accessing elements of a 2D array
int element = arrayName[rowIndex][columnIndex];
Length of a 2D Array:
You can find the number of rows and columns in a 2D array using the length property:

java
Copy code
int rows = arrayName.length; // Number of rows
int cols = arrayName[0].length; // Number of columns (assuming all rows have the same length)
Iterating Over a 2D Array:
You can use nested loops to iterate over all elements of a 2D array:

java
Copy code
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        // Access and process each element: arrayName[i][j]
    }
}
Initializing an Empty 2D Array:
If you want to initialize a 2D array without specifying initial values, you need to provide the dimensions:

java
Copy code
dataType[][] arrayName = new dataType[rows][cols];
For example:

java
Copy code
int[][] emptyMatrix = new int[3][3]; // Creates a 3x3 2D array with all elements initi
-----------------------------------------------------------------------------------------------------------------------------------
StringBuilder-

In Java, StringBuilder is a class that provides a way to create mutable sequences of characters. Unlike the String class, which is immutable (meaning its value cannot be changed once it's created), StringBuilder allows you to modify the contents of the sequence without creating a new object each time.

Here are some key points about StringBuilder:

Mutable: StringBuilder objects are mutable, meaning you can change the contents of the string without creating a new object.

Efficient: Since StringBuilder objects are mutable, they can be more efficient than using regular string concatenation, especially when dealing with large amounts of text.

StringBuilder vs. StringBuffer: Java also provides another class called StringBuffer, which is similar to StringBuilder but is thread-safe (i.e., it can be used in multithreaded environments). StringBuilder is not thread-safe, but it is generally faster because it's not synchronized.

Methods: StringBuilder provides methods for appending, inserting, deleting, replacing, and reversing characters in the sequence.
---------------------------------------------------------------------------------------------------------------------------------
Operator is a symbol that tells the compiler to perform some operations on the basis of which type of operator symbol you are using...
ex- 1+2 -> so here 1 and 2 are operands and the '+' Sign is our operator which is arithematic operator.

1) Arithematic Operator - Arithematic operator are those operator which is responsible to do mathematical calculations - +,-,*,/,%(This is our modulo operator which gives us remainder value when we divide any kind of number.). It perfomrs on two operands...
*Unary Operator- ++ ,-- ->these operator perform on single operand 
ex- a++ ,b-- (these both are post increment/decrement) ,++a , --b (these both are pre increment/decrement).

2) Relational Operator - Relational Operator are those operator which is use to establish the relation between two operands...
ex- == , < , > , <= , >=, != etc. these are relational operartors which is used to compare the values , checking the equality of the values and many more.

3) Logical Operators - logical operators are those operators which is used to check the value is true or false logically 
Types -> 
(i) - Logical AND (&&) - If both conditions are true then only it works. It checks both the conditions is true or false if first condition is false then it doesnot check the another condition. 
(ii) - Logical OR (||) -  it also checks the both conditions are true or false if any one condition is true then it gives the true result. otherwise it gives the false result..9
(iii) - Logical NOT (!) - It reverse the statement if statement gives true then it gives the false and it's vice versa.

4) Bitwise Operators - Bitwise operators are used to perform operations on individual bits of integer operands.Bitwise operators gives the output in bits. There are several bitwise operators in Java:-

Bitwise AND (&): If both bits are 1, the result is 1. Otherwise, it's 0.
Bitwise OR (|): If either bit is 1, the result is 1. If both are 0, the result is 0.
Bitwise XOR (^): If both bits are different, the result is 1. If both bits are the same, the result is 0.
Bitwise NOT (~): Inverts each bit. If it's 1, it becomes 0, and if it's 0, it becomes 1.
Left Shift (<<): Moves all bits to the left by a specified number of positions. New bits entering from the right are filled with zeros.
Right Shift (>>): Moves all bits to the right by a specified number of positions. The sign bit (the leftmost bit) is used to fill in new bits when shifting right.
Unsigned Right Shift (>>>): Similar to right shift (>>), but the vacant bits are filled with zeros regardless of the sign bit.

5) Assignment Operator - 
= -> a=b; means b is stored in a execuition is right to left
+= -> a=a+b; means first additon happens then the sum of a and b is stored in the a.
-= -> same as for all the assignment operators.
*= -> same as for all the assignment operators.
/= -> same as for all the assignment operators.
-------------------------------------------------------------------------------------------------------------------------------------

*Binary Number System - In mathematics we have decimal number system and in programming and computer wee have binary number system.
-Mathematics we have numbers from 0 to 9 = 10 numbers means it has base 10 
-Binary number we have 2 numbers - 0 and 1 and base 2

Binary- 0 and 1 are binary base-2 numeral system 
4 into binary = 100 -> we need to divide the number by 2 till and captures the remainder and divide till we get the remainder 1. after getting the remainder one write the remainder in reverse order like - 100 which is binary of 4.

Binary to decimal - take an example of 4 binary number - 100 convert into decimal we need:-
100 = 1*2^2+0*2^1+0*2^0 = so we get 4. 
2^0 always gives the 1 and any number which has the power 0 it gives the result 1. and place value ke hisaab se 2 ki powers lagate jayenge.
=====================================================================================================================================
ASCII Values:- Uppercase Letters (A-Z):

A: 65
B: 66
C: 67
D: 68
E: 69
F: 70
G: 71
H: 72
I: 73
J: 74
K: 75
L: 76
M: 77
N: 78
O: 79
P: 80
Q: 81
R: 82
S: 83
T: 84
U: 85
V: 86
W: 87
X: 88
Y: 89
Z: 90
Lowercase Letters (a-z):

a: 97
b: 98
c: 99
d: 100
e: 101
f: 102
g: 103
h: 104
i: 105
j: 106
k: 107
l: 108
m: 109
n: 110
o: 111
p: 112
q: 113
r: 114
s: 115
t: 116
u: 117
v: 118
w: 119
x: 120
y: 121
z: 122
====================================================================================================================================
Bit Manipulation :- here with the help of bit manipulation we can do these four operations - get bit , set bit , clear bit , update bit. Bit manipulation means bit me changes karna usko mutate karna so we can do all these stuff with the halp of bit manipulation..Bit manipulation is commonly used in computer programming for tasks like optimizing code, working with binary data, and solving algorithmic problems.

Bit- Bit is a building block that allows the computer to store and process the data...Bits are used in computers to reperesent the simplest form of information in computer. Each bit storing a single binary value which is either 0 or 1.

Bit Mask -  Bit mask ek aise technique hai jisme hum binary numbers ke specific bits ko manipulate karte hain, jaise ki aapne kaha, get bit, set bit, clear bit, aur update bit operations ke through. Yeh operations hume allow karte hain ki hum sirf chune hue bits ke saath interact karein, aur baaki ke bits ko as it is rakhein. Is tarah se, bit masking ek powerful tool hai jisse hum binary data ko control aur modify kar sakte hain, aur humare code ko optimize aur efficient banane mein madad karta hai. 

1) Get Bit - get bit means bit ko janna ki particular index pe konsi bit hai..
we are calculating the bit from right to left not the left to right 
first we need to find the BitMask of any number and here bitmask is - apne binary number ke saath get bit karna set bit karna update karna ye saare operations ko bit masking kehte hain...aur jisme hum ek additional number use karte hain jo BitMask hota hai..
for calculating bitmask we need to calculate the - 1<<i where i is our position which position we want 
example - i=2; and n =0101
1<<2 
0001<<2 = 0100
Second step Do operation here we do AND 
0100 AND 0101
0100 -> so here agar result non-zero aata hai to bit = 1 and agar zero result aata hai like - 0000 to bit =0
 
2) Set Bit - In set get me hum koi bhi bit hai hamare paas kisi bhi position pe usko hume 1 banana hota hai 
Step -1 - Calculate BitMask 
Step -2 - Do Operation - OR
Example - n=0101 , i(positon) = 1
1- calculate BitMask - 1<<1
0001<<1 = 0010
2- do operation - OR
0010 OR 0101
0111 -> here we set the bit on the position = 1 which is second bit aur jab bit ko set karte hain to 0 waali bit ko hum 1 bana dete hain

3) Clear Bit - In clear bit me hum kisi bhi position pe jaake kisi bhi bit ko hum 0 bana dein usko clear bit kehte hain..
Step 1- Calculate BitMask 
Step 2- Do Operation AND With NOT
example - n=0101 , pos(i) = 2 
1- calculate BitMask - 1<<2
0001<<2 = 0100
2- Do Operation NOT with AND
so, in this case first we calculate the NOT then we calculate the AND 
~(0100) = 1011
so now we are calculating the AND 
1011 & 0101
0001 = finally we clear the bit means 1 ko zero bana do at the given position = 2

4) Update Bit - In update bit mein kisi bhi bit ko hum 1 bana dein aur kisi bhi bit ko hum zero bana dein 
so isme basically do operation perform hote hain->
1- set the bit means 0 bit ko set kro 1 mein kyuki bit ko 1 banane ke liye
2- clear the bit means 1 ko clear krdo usko zero banao 
Isme hum user ye uski choice ke according usse puch lenge ki wo 1 ya 0 kisme change karna chahta hai apni bit ko..
we use these two operations for making the bit 0 or 1..

