package IterationControlLoopAndJumpStatements.ForLoop;

public class PrimeRangeExplorer {

    public static void main(String[] a) {

        System.out.println("\n*** Welcome to the Prime Range Checker From 1 to 100 ***\n");

        for ( int i = 1; i <= 100 ; i++ ) {
            boolean isPrime = true;
            for ( int j = 2; j <= i -1 ; j++ ) {
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }

            if ( isPrime == true && i > 1) {
                System.out.println(i + " is Prime Number");
            }

        }

    }

}
