package OperatorsAndDecisionLogic;
import java.util.*;

public class SumOfDigitFinderAndEvenChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Sum of Digits Finder and Even or Not Checker ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        int lastDigit1 = num % 10;
        int digit1 = num / 10;

        int lastDigit2 = digit1 % 10;
        int digit2 = digit1 / 10;

        int lastDigit3 = digit2 % 10;
        int digit3 = digit2 / 10;

        int lastDigit4 = digit3 % 10;
        int digit4 = digit3 / 10;

        int lastDigit5 = digit4 % 10;
        int digit5 = digit4 / 10;

        int lastDigit6 = digit5 % 10;
        int digit6 = digit5 / 10;

        int lastDigit7 =digit6 % 10;
        int digit7 = digit6 / 10;

        int lastDigit8 = digit7 % 10;
        int digit8 = digit7 / 10;

        int lastDigit9 = digit8 % 10;
        int digit9 = digit8 / 10;

        int lastDigit10 = digit9 % 10;
        int digit10 = digit9 % 10;

        int sumOfDigits = lastDigit1 + lastDigit2 + lastDigit3 + lastDigit4 + lastDigit5 + lastDigit6 + lastDigit7 + lastDigit8 + lastDigit9 + lastDigit10;

        System.out.println("Sum of Digits of Your Number is: " + sumOfDigits );

        if ( sumOfDigits % 2 == 0 ) {
            System.out.println("Sum of Digits of Your Number " + sumOfDigits + " is Even." );
        }
        else {
            System.out.println("Sum of Digits of Your Number " + sumOfDigits + " is Not Even.");
        }

    }

}
