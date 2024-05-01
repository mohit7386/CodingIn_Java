public class Continue {
    public static void main(String[] args) {
        System.out.println("Here are the numbers!");
        for (int i = 1; i <= 20; i++) {
            if (i == 12) {
                System.out.println(
                        "Here 12 is skipped with the use of continue because it skips the current iteration and rest of the iteration will print as before but in break it skips all the statements below after using break in between");
                continue;
            }
            System.out.println(i);
        }
    }

}
