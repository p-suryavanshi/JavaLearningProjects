package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class NumberReverser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Reverser ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int i = num;
        String reverseNumber = "";

        while ( i > 0 ) {
            int lastDigit = i % 10;
            reverseNumber += lastDigit;
            i /= 10;
        }

        System.out.println("Your Number " + num + " is Reversed: " + reverseNumber);

    }

}
