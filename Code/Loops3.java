public class Loops3 {
    public static void main(String[] args){
        System.out.println("Printing the alphabets using for loop");
        for(char i='A';i<='M';i++){
            System.out.println(i);
        }
        System.out.println("Printing the alphabets using ASCII Values");
        for(char i=65;i<=90;i++){ //65 denotes the capital alphabetical letters
            System.out.println(i);
        }
    }
}
