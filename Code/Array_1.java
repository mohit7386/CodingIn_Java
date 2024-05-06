//WAP to print the marks of 3 students using array
public class Array_1 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        // Storing the marks
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 97;
        marks[3] = 100;
        marks[4] = 100;
        System.out.println("Marks of all Five Subjects:-");
        System.out.println("English: " + marks[0]); // you need to mention the index always...which index value you
                                                    // want to print so always mention the index of the element
                                                    // otherwise it will give you the jargan value which is garbage
                                                    // value
        System.out.println("Computer: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        System.out.println("Physics: " + marks[3]);
        System.out.println("Chemistry: " + marks[4]); // If you are try to give the index greater then the limit of the
                                                      // array then compiler throughs an error - 'out of bounds for
                                                      // length' - something like that
    }
}
