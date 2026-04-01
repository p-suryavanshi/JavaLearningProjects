package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class DigitExtracter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Digit Extracter ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int digit = 0;

        for ( int i = num; i > 0; i /= 10 ) {
            digit++;
        }

        System.out.println("Number " + num + " have " + digit + " Digits");

    }

}
