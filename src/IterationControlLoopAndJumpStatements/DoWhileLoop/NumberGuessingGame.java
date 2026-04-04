package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Guessing Game ***\n");

        int secretNum = 45;
        int num;

        do {
            System.out.print("Please enter your Guessed Number: ");
            num = sc.nextInt();

            if ( num < secretNum) {
                System.out.println("Too Low!");
            } else if (num > secretNum){
                System.out.println("Too High!");
            }

        } while ( secretNum != num );

        System.out.println("\nCongratulations! You guessed it.");

    }

}