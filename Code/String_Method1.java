//Here we will see the some popular methods of strings we can use 
public class String_Method1 {
    public static void main(String[] args) {
        String quote = "My Name is Mohit Pratap Singh I am a Engineer!";
        System.out.println("The length of your given quote is: " + quote.length());
        String quote2 = "Hello I am play with String Methods It's Pretty cool!";
        System.out.println("Your text is converted into Uppercase: " + quote2.toUpperCase());
        // same another method is toLowercase() which is converted your uppercase text
        // into the lowercase.
        String quote3 = "Hello World Namste! Jai Shree Ram! Radhe krishna!";
        System.out.println("The index of your first occurence of your given text is: " + quote3.indexOf("Jai")); // indexOf
                                                                                                                 // method
                                                                                                                 // returns
                                                                                                                 // the
        // index of
        // first occurence means it returns the index position of the first letter so
        // where it returns the index position of the letter 'j'
    }

}
