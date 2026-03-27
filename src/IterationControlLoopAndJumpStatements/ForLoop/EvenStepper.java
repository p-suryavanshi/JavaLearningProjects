package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class EvenStepper {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Even Stepper ***\n");

        System.out.print("Please enter a Nmber till you want Even Numbers: ");
        int num = sc.nextInt();

        for( int i = 2 ; i <= num ; i += 2 ) {
            System.out.println("Even Number is: " + i);
        }

    }

}
