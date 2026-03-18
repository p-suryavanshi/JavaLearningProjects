package OperatorsAndDecisionLogic;
import java.util.*;

public class FirstDigitIsGreaterThanLastDigitNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker First Digit is Greater than the Last Digit ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        int firstDigit = (num + "").charAt(0) - '0';
        int lastDigit = num % 10 ;

        if ( firstDigit > lastDigit ) {
            System.out.println("First Digit " + firstDigit + " is Greater Than the Last Digit.");
        }
        else {
            System.out.println("First Digit " + firstDigit + " is Not Greater Than the Last Digit.");
        }

    }

}
