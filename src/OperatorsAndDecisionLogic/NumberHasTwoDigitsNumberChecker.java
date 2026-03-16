package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberHasTwoDigitsNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number has Two Digits or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num >= 10 && num <= 99 ) {
            System.out.println("Number " + num + " has Two Digits.");
        }
        else {
            System.out.println("Number " + num + " Doesn't have Two Digits.");
        }

    }

}
