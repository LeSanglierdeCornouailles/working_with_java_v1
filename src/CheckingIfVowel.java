import java.util.Scanner;

// Create Class
public class CheckingIfVowel {
    public static void main(String[] args){
        Scanner word  = new Scanner(System.in);
        System.out.print("Please enter any word :");
        String anyword  = word.next();
        System.out.println(CheckingIfStringHasVowel(anyword));

    }
    public static boolean CheckingIfStringHasVowel(String anyword){
        return anyword.toLowerCase().matches(".*[aeiou].*");
    }

}
