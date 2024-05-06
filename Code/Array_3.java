public class Array_3 {
    public static void main(String[] args) {
        // We can also declare the array as - type[] arrayName = {1,2,3,4,5};
        int marks[] = { 98, 99, 90, 96, 97 }; // we don't need to decalre the size of the array here because array
                                              // already know that the size is - 5 because we stored the 5 subjects
                                              // marks
        System.out.println("Marks of all 5 Subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }

}
