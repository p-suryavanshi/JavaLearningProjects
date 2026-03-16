package OperatorsAndDecisionLogic;
import java.util.*;

public class LastDigitIsOddNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Last Digit of a Number is Odd ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 != 0 ) {
            System.out.println("Last Digit of a Number " + num + " is Odd.");
        }
        else {
            System.out.println("Last Digit of a Number " + num + " is Not Odd.");
        }

    }

}
