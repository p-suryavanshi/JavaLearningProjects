package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.Scanner;

public class SeriesSum {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a Number: ");
        int num = sc.nextInt();

        //System.out.println(1 + 1 / 2 + 1 / 3 + 1 / 4 + 1 / 5 + 1 / 6 + 1 / 7 + 1 / 8 + 1 / 9 + 1 / 10);

        double sum = 1;

        for ( int i = 1; i <= num; i++ ) {
            sum = sum + 1.0 / i;
        }

        System.out.println(sum);

    }

}
