import java.util.Scanner;

public class Funct_DeciToBinANDBinToDeci {
    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning of the string
            decimal = decimal / 2;
        }
        return binary.toString();
    }

    // Function to convert binary to decimal

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0'; // Convert char to integer
            decimal += bit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert decimal to binary
        System.out.println("Enter a decimal number:");
        int decimalInput = scanner.nextInt();
        String binaryResult = decimalToBinary(decimalInput);
        System.out.println("Binary representation: " + binaryResult);

        // Convert binary to decimal
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Enter a binary number:");
        String binaryInput = scanner.next();
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal representation: " + decimalResult);

        scanner.close();
    }
}
