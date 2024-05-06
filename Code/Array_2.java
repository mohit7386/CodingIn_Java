public class Array_2 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        // we can also declare the array as- int marks[] = new int[5]; both syntaxes for
        // writing the array are valid syntaxes you can use any of them
        // Storing the marks
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 97;
        marks[3] = 100;
        marks[4] = 100;
        for (int i = 0; i < 5; i++) { // here we are iterating to the index of elements of the array..
            System.out.println(marks[i]);
        }
    }
}
