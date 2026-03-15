package OperatorsAndDecisionLogic;
import java.util.*;

public class BetweenTenAndTwentyNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Between 10 And 20 or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num < 20 && num > 10) {
            System.out.println("Number " + num + " is Between 10 and 20.");
        }
        else {
            System.out.println("Number " + num + " is Not Between 10 and 20.");
        }

    }

}
