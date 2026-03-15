package OperatorsAndDecisionLogic;
import java.util.*;

public class LessThanFiftyNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Less Than 50 or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num < 50 ){
            System.out.println("Number " + num + " is Less Than 50.");
        }
        else if ( num == 50 ) {
            System.out.println("Number " + num + " is Equal to 50.");
        }
        else {
            System.out.println("Number " + num + " is not Less Than OR Equal to 50.");
        }


    }

}
