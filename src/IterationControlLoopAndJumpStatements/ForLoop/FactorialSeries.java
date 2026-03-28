package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class FactorialSeries {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Factorial Series ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        long fact = 1;

        for ( int i = 1; i <= num ; i++ ) {
            fact *= i;
            System.out.println(i + "! = " + fact);
        }

    }

}
