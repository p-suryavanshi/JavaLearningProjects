package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class ZeroToOneTriangleBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the 0-1 Triangle Printer ***\n");

        System.out.print("Please enter the Lines you want: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ){
            for ( int j = 1; j <= i; j++ ) {
                int sum  = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

}
