package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SquareAndCubeSum {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Square & Cube Sum Calculator ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        int square = 0;
        int cube = 0;

        for ( int i = 1; i <= num ; i++ ) {
            square += (i * i);
            cube += (i * i * i);
        }

        System.out.println("Sum of Square till " + num);
        System.out.println(square);
        System.out.println("sum of Cube till " + num);
        System.out.println(cube);
    }

}
