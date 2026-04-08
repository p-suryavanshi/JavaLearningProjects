package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class RightHalfPyramid {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Right Half Pyramid Printer ***\n");

        System.out.print("Please enter the Lines you want: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            for (int j = 1; j <= num-1; j++) {
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++ ) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
