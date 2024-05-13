public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); // append method in the string builder is used to add the character in the last
                        // of the string..
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println("After using append with the given string then the final string is: " + sb);
        System.out.println("The length of the final String is: " + sb.length());// we can also find the length of our
                                                                                // string using stringbuilder class
    }

}
