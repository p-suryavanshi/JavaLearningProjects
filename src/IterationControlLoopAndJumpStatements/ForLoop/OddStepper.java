package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class OddStepper {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Odd Stepper ***\n");

        System.out.print("Please enter the Number till you want Odd Numbers: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num ; i += 2  ) {
            System.out.println(i);
        }

    }

}
