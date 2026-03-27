package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class ReverseCountdown {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Reverse Countdown ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        for ( int i = num ; i >= 1 ; i-- ) {
            System.out.println(i);
        }

    }

}
