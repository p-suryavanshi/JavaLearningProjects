package OperatorsAndDecisionLogic;
import java.util.*;

public class LastDigitIsEvenNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Last Digit is Even or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("Last Digit of the Number " + num + " is Even.");
        }
        else {
            System.out.println("Last Digit of the Number " + num + " is Not Even.");
        }

    }

}
