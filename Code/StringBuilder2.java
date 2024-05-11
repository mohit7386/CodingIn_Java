public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); // append method is used to add the character in the last of the string
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());// we can also find the length of our string using stringbuilder class
    }

}
