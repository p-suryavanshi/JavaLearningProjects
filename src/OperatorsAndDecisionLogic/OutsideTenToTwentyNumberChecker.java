package OperatorsAndDecisionLogic;
import java.util.*;

public class OutsideTenToTwentyNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Outside From 10 to 20 OR Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num < 10 || num > 20 ) {
            System.out.println("Number " + num + " is Outside From 10 to 20.");
        }
        else {
            System.out.println("Number " + num + " is Between 10 and 20.");
        }

    }

}
