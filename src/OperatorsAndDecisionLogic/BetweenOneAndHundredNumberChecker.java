package OperatorsAndDecisionLogic;
import java.util.*;

public class BetweenOneAndHundredNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Between 1 and 100 OR Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num > 1 && num < 100 ) {
            System.out.println("Number " + num + " is Between 1 and 100.");
        }
        else {
            System.out.println("Number " + num + " is Not Between 1 and 100.");
        }

    }

}
