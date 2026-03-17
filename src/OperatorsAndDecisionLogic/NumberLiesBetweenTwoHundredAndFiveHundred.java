package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberLiesBetweenTwoHundredAndFiveHundred {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number lies Between 200 and 500 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num > 200 && num < 500 ) {
            System.out.println("Number " + num + " is lies Between 200 and 500.");
        } else {
            System.out.println("Number " + num + " is Not lies Between 200 and 500.");
        }

    }

}
