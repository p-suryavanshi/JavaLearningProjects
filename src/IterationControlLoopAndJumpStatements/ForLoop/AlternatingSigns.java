package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.Scanner;

public class AlternatingSigns {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a Number to see Magic: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num ; i++ ) {
            if ( i % 2 != 0 ) {
                System.out.println(" " + i);
            }
            if ( i % 2 == 0 ) {
                System.out.println("-" + i);
            }
        }

    }

}
