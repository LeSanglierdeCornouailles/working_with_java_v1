import java.util.Scanner;

public class ClassRemovingWhiteSpaces {
    public static String RemovingWhiteSpaces(String word){
        //Create obj to store none whitespace
        StringBuilder out = new StringBuilder();
        // Create en empty array
        char[] charArray = word.toCharArray();
        //Iterate through array
        for (char c :charArray){
            //Check if no whitespace character.
            System.out.println(c);
            if (!Character.isWhitespace(c))
                //Add the character to obj
                out.append(c);
        }
        //Return the value
        return out.toString();

    }
    public static void main(String[] args){
        Scanner anyword = new Scanner(System.in);
        System.out.print("Please enter anyword: ");
        String  word = anyword.nextLine();
        String result = RemovingWhiteSpaces(word);
        System.out.println(result);

    }
}
