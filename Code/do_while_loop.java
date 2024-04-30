public class do_while_loop {
    public static void main(String[] args) {
        // syntax for do-while-loop
        // initialisation of a variable
        // do{
        // printing the statement -> the main difference in while and do while loop is
        // -> do while loop is run atleast one time whether the condition is true or
        // false
        // i++/i--; increment or decrement the condition
        // }
        // while(check condition); - here we are using terminator after putting the
        // condition in the while
        int i = 0;
        do {
            System.out.println(i); // here it prints whether the condition is true or false
            i++;
        } while (i <= 10);
    }

}
