package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberHasFourDigitsNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number Has Four Digits or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num >= 1000 && num <= 9999 ) {
            System.out.println("Number " + num + " has Four Digits.");
        }
        else {
            System.out.println("Number " + num + " do Not have Four Digits.");
        }

    }

}
