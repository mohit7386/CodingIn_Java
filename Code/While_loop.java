//learning while loop in java 
public class While_loop {
    public static void main(String[] args) {
        // syntax of while loop
        /*
         * int i = 0; - intialise the variable
         * while (i <= 10) { - Checking the condition
         * System.out.println(i); - Printing the statement
         * i++/i-- > increment or decrement the variable
         */
        int i = 0; // first we need to initialise our variable
        while (i <= 10) { // then for checking the condition we use while
            System.out.println(i); // after checking the condition we are printing the value after that we can
                                   // increment or decrement the value
            i++;
        }
    }

}
