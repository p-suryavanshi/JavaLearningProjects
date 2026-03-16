package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberHasThreeDigitsNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number has Three Digits or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num >= 100 && num <= 999 ) {
            System.out.println("\nNumber " + num + " has Three Digits.");
        }
        else {
            System.out.println("\nNumber " + num + " do Not have Three Digits.");
        }


    }

}
