import java.util.Scanner;

public class CleaningAnyString {
    public static void main(String[] args){
        Scanner anyword = new Scanner(System.in);
        System.out.println("Please enter any word: ");
        String word = anyword.nextLine();

        //String wordTrimed =  word.trim();
        String wordStriped = word.strip();

        //System.out.println(wordTrimed+ " against "+ word );
        System.out.println(wordStriped+ " against"+ word );
    }
}
