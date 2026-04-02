package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Inverted Half Pyramid Printer ***\n");

        System.out.print("Please enter the Lines you want: ");
        int num = sc.nextInt();

        for ( int i = num; i > 0; i-- ) {
            for ( int j = i ; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
