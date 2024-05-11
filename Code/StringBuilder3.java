//reverse a string using string builder
public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) { //when we are reversing a string or anything we only reverse the half of the string rest will automatic reversed 
            // find the indexes which we want to replace
            int front = i;
            int back = sb.length() - 1 - i; // i is used for incrementing the index and adjusting the index positions
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            // now for replacing the elements in the string we are using the setchar method
            sb.setCharAt(front, backchar); // yahan pe front is index and we can store the backchar on the front of
                                           // index
            sb.setCharAt(back, frontchar); // yahan pe back is also a index and we are storing the frontchar to the back
                                           // index
        }
        System.out.println("Your Reversed String: " + sb);
    }

}
