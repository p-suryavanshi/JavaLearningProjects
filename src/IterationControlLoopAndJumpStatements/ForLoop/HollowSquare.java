package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class HollowSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Hollow Square Printer ***\n");

        System.out.print("Please enter the lines you want to print: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            for ( int j = 1; j <= num; j++) {
                if (i == num || i == 1 || j == num || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
