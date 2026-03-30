package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class PrimeNumberChecker {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Prime Number Checker ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for ( int i = 2; i <= num - 1; i++) {
            if ( num % i == 0 ) {
                isPrime = false;
                break;
            }
        }

        if ( isPrime == true && num > 1 ) {
            System.out.println(num + " is Prime Number.");
        } else {
            System.out.println(num + " is Not Prime Number.");
        }

    }

}
