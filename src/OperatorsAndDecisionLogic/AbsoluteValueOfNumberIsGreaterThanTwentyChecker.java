package OperatorsAndDecisionLogic;
import java.util.*;

public class AbsoluteValueOfNumberIsGreaterThanTwentyChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Absolute Value of a Number is Greater than 20 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num > 20 || num < -20 ) {
            System.out.println("Absolute Value of the Number " + num + " is Greater than 20.");
        }
        else {
            System.out.println("Absolute Value of the Number " + num + " is Not Greater than 20.");
        }

    }

}
