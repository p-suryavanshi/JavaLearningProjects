package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class LeftHalfPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Left Half Pyramid ***\n");

        System.out.print("Please enter the Lines You want: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ){
            for (int j = 1; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
