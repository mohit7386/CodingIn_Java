import java.util.*;
public class Loops2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit where you want to print the counting");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){ //here we are taking the termination condition from the user it will stop the loop till the user wants to stop.
            System.out.println(i);
        }
    }
}
