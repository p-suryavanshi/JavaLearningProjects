package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberLiesOutsideHundredToTwoHundred {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number lies Outside 100 and 200 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num < 100 || num > 200 ) {
            System.out.println("Number " + num + " is lies Outside 100 and 200.");
        }
        else {
            System.out.println("Number " + num + " is Not lies Outside 100 and 200.");
        }

    }

}
