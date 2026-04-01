package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SolidSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Solid Square ***\n");

        System.out.print("Please enter the Number You want to print the Star (*): ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            for ( int j = 1; j <= num; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}