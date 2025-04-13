import java.util.Scanner;

public class FibonacciSeq {
    public static int CreateFibSeq (int n){
        int fi[] = new int[n+1];
        int i;

        fi[0] = 0;
        fi[1] = 1;

        for (i=2; i<=n; i++){
            fi[i] = fi[i-1]+fi[i-2];
        }
        return fi[n];
    }
    public static void main(String[] args){
        Scanner anynumber = new Scanner(System.in);
        System.out.print("Please enter any number :");
        int n = anynumber.nextInt();
        System.out.println(CreateFibSeq(n));
    }
}
