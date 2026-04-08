package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n**** Welcome to the Fibonacci Sequence Generator ***\n");

        System.out.print("Please enter the Terms do you want: ");
        int term = sc.nextInt();

        int a = 0;
        int b = 1;

        for ( int i = 1; i <= term; i++ ){
            System.out.println(a + " ");
            int nextTerm = a + b;

            a = b;
            b = nextTerm;
        }

    }

}
