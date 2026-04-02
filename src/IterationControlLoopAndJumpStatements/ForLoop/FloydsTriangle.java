package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class FloydsTriangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Floyd's Triangle ***\n");

        System.out.print("Please enter the Lines you want: ");
        int num = sc.nextInt();

        int number = 1;

        for ( int i = 1; i <= num; i++ ) {
            for ( int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }

}
