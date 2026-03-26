package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class OddEvenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a Number: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            if ( i % 2 == 0 ) {
                System.out.println(i + " is Even.");
            } else {
                System.out.println(i + " is Odd.");
            }
        }

    }

}
