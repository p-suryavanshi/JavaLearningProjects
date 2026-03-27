package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SkipperLogic {

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Skipper ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        for ( int i = 1; i <= num; i++ ) {

            if ( !(i % 3 ==  0 && i % 7 == 0) )  {
                System.out.println(i);
            }

        }

    }

}
