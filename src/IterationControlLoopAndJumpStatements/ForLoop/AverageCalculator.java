package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class AverageCalculator {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Average Calculator ***\n");

        System.out.print("Please enter the Number Till you want Odd Average: ");
        int num = sc.nextInt();

        int total = 0;
        int count = 0;
        for ( int i = 1; i <= num; i++ ) {
            if (i % 2 != 0) {
                total = total + i;
                count++;
            }
        }
        System.out.println(total/count);

    }

}
