package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class EvenOddSum {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Even Odd Sum ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for ( int i = 1 ; i <= num; i++ ) {
            if ( i % 2 == 0 ) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Even Numbers Sum: " + evenSum);
        System.out.println("Odd Numbers Sum: " + oddSum);


    }

}
