package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SumOfNaturalNumbers {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a Number Till you want to Sum: ");
        int num = sc.nextInt();

        int sum = 0;

        for ( int i = 1 ; i <= num ; i++ ) {
            sum = sum + i;
        }

        System.out.println(sum);


    }

}
