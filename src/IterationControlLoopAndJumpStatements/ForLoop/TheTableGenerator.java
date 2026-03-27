package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class TheTableGenerator {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Table Generator ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= 10 ; i++ ) {
            System.out.println(num + " X " + i + " = " + (num * i) );
        }

    }

}
