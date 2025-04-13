import java.util.Scanner;

public class CheckingIfInputIsPalindrome {
    public static void MethodCheckingIfInputIsPalindrome(String word){
        String ReversedWord = new StringBuilder(word).reverse().toString();

        if(word.equals(ReversedWord)){
            System.out.println(word +" is a Palindrome");
        }else{
            System.out.println(word +" is not a Palindrome");
        }
    }
    public static void main(String[] args){
        Scanner anyword = new Scanner(System.in);
        System.out.print("Please enter any word :");
        String  word = anyword.next();
        MethodCheckingIfInputIsPalindrome(word);
    }
}
