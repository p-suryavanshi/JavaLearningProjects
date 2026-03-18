package OperatorsAndDecisionLogic;
import java.util.*;

public class FirstDigitOfNumberIsEvenChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker First Digit of a Number is Even or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        int firstDigitIsEven = (num + "").charAt(0);

        if ( firstDigitIsEven % 2 == 0 ) {
            System.out.println("First Digit of the Number " + num + " is Even.");
        }
        else {
            System.out.println("First Digit of the Number " + num + " is Not Even.");
        }

    }

}
