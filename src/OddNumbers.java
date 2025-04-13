import java.util.Scanner;

public class OddNumbers {
    public static void CheckingOddsNumbers(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd");
        }
    }
    public static void main (String[]args){
        Scanner anynumber = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int number = anynumber.nextInt();
        CheckingOddsNumbers(number);
    }
}