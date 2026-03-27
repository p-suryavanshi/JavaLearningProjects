package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class TheDynamicRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Dynamic Range ***\n");

        System.out.print("Please Enter the Starting Number: ");
        int start = sc.nextInt();

        System.out.print("Now, Enter the Ending Number: ");
        int end = sc.nextInt();

        if ( start < end ) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = start; i >= end ; i--) {
                System.out.println(i);
            }
        }

    }

}
