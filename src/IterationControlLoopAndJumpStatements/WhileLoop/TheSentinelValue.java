package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class TheSentinelValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Sentinel Value ***");

        while ( true ) {
            System.out.print("\nPlease enter a Number: ");
            int num = sc.nextInt();

            if ( num != 0 && num != -1 ) {
                System.out.println("You have entered: " + num);
            } else if ( num == 0 ) {
                System.out.println("\nYou have entered 0! Program is Closed.");
                break;
            } else {
                System.out.println("\nYou have entered -1! Program is Closed.");
                break;
            }

        }

    }

}
