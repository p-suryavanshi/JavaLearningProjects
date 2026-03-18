package OperatorsAndDecisionLogic;
import java.util.*;

public class FirstDigitEqualsLastDigitChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the First Digit is Equal to Last Digit Checker ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        String s = Integer.toString(num);
        int firstDigit = Character.getNumericValue(s.charAt(0));
        int lastDigit = num % 10;

        if ( firstDigit == lastDigit ) {
            System.out.println("First Digit " + firstDigit + " is Equal to Last Digit " + lastDigit);
        }
        else {
            System.out.println("First Digit " + firstDigit + " is Not Equal to Last Digit " + lastDigit);
        }

    }

}
