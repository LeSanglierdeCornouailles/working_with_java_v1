import java.util.Scanner;

// Creating class
public class CheckingIfItIsPrimeNumber {
    //Creating method
    public static void main(String[] args){
        //Defining variables assigning values to it
        boolean flag = false;
        //Asking user to input a number
        Scanner anynumber = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int number  = anynumber.nextInt();

        //removing 0 and 1
        if (number == 0 || number == 1){
            flag = true;
        }
        //Iterating to find the nonprime number
        for (int i=2 ; i<= number; i++ ){
            //checking nonprime number
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println(number + " is a prime number");
        else
            System.out.println(number+" is not a prime number");
    }
}
