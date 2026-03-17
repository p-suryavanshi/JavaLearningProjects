package OperatorsAndDecisionLogic;
import java.util.*;

public class BetweenFiftyAndHundredNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Between 50 and 100 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num > 50 && num < 100 ) {
            System.out.println("Number " + num + " is lies Between 50 and 100.");
        } else {
            System.out.println("Number " + num + " is Not lies Between 50 and 100.");
        }

    }

}
