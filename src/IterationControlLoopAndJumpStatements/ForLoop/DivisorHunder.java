package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class DivisorHunder {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Divisor Hunter ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {

            if (num % i == 0) {
                System.out.println(i);
            }

        }

    }

}
