package OperatorsAndDecisionLogic;
import java.util.*;

public class GreaterThanHundredNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Greater Than 100 or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num > 100 ){
            System.out.println("Number " + num + " is Greater Than 100.");
        } else if ( num == 100 ) {
            System.out.println("Number " + num + " is Equal to 100." );
        }
        else {
            System.out.println("Number " + num + " is Less Than 100.");
        }


    }

}
