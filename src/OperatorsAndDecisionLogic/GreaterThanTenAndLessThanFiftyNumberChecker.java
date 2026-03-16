package OperatorsAndDecisionLogic;
import java.util.*;

public class GreaterThanTenAndLessThanFiftyNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Greater Than 10 and Less Than 50 ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num > 10 && num < 50 ) {
            System.out.println("Number " + num + " is Greater Than 10 and Less Than 50.");
        }
        else {
            System.out.println("Number " + num + " is Not Greater Than 10 and Less Than 50.");
        }

    }

}
