package OperatorsAndDecisionLogic;
import java.util.*;

public class LastDigitIsZeroNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Last Digit of a Number is 0 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 10 == 0 ) {
            System.out.println("Last Digit of Number " + num + " is Zero.");
        }
        else {
            System.out.println("Last Digit of Number " + num + " is Not Zero.");
        }

    }

}
