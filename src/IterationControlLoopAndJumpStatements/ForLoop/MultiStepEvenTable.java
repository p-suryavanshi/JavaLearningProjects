package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class MultiStepEvenTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Multi Step Table ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        for ( int i = 2 ; i <= 10 ; i += 2 ) {
            System.out.println(num + " X " + i + " = " + (num * i) );
        }

    }
}
