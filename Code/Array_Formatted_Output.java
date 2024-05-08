import java.util.Scanner;

public class Array_Formatted_Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Format: Enter a String followed by an integer on each line.");

        // Print the header line
        System.out.println("================================");

        // Read input and format output
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            // Format the output using printf
            System.out.printf("%-15s%03d%n", str, num);
        }

        // Print the footer line
        System.out.println("================================");

        scanner.close();
    }
}
