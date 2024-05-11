import java.util.*;

public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Mohit");

        System.out.println(sb);
        System.out.println(sb.charAt(4));
        sb.setCharAt(4, 'S'); // with the help of set char we can replace the character at the particular
                              // index.It replaces the previous character and insert the new one character
                              // into our string

        System.out.println(sb);
        sb.insert(3, 'S'); // with the help of insert method we can insert any character in our string..
        System.out.println(sb);
        sb.delete(3, 4); // here humne 3 se leke 4 tak likha hai but last index non-inclusive hota hai wo
                         // ek kam hi lega 4 hai to 3 lega and 3 hai to 2 tk jaayega '-1' hota hai
        System.out.println(sb);
        sc.close();

    }

}
// In Java, StringBuilder is a class that provides a way to create mutable
// sequences of characters. Unlike the String class, which is immutable (meaning
// its value cannot be changed once it's created), StringBuilder allows you to
// modify the contents of the sequence without creating a new object each time.

// Here are some key points about StringBuilder:

// Mutable: StringBuilder objects are mutable, meaning you can change the
// contents of the string without creating a new object.

// Efficient: Since StringBuilder objects are mutable, they can be more
// efficient than using regular string concatenation, especially when dealing
// with large amounts of text.

// StringBuilder vs. StringBuffer: Java also provides another class called
// StringBuffer, which is similar to StringBuilder but is thread-safe (i.e., it
// can be used in multithreaded environments). StringBuilder is not thread-safe,
// but it is generally faster because it's not synchronized.

// Methods: StringBuilder provides methods for appending, inserting, deleting,
// replacing, and reversing characters in the sequence.