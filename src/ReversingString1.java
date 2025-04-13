// Import the Scanner class
import java.util.Scanner;

public class ReversingString1 {
    public static void main(String[] args){
        //Create a Scanner object
        Scanner word = new Scanner(System.in);
        System.out.print("Please enter a word :");
        //Read the user input with .nextLine()
        String string  = word.next();
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        System.out.println(sb.toString());
    }

}
