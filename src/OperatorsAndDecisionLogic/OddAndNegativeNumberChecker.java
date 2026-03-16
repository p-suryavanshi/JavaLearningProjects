package OperatorsAndDecisionLogic;
import java.util.*;

public class OddAndNegativeNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Odd and Negative ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 2 != 0 && num < 0 ) {
            System.out.println("Number " + num + " is Odd and Negative.");
        }
        else if ( num % 2 == 0 && num >= 0 ) {
            System.out.println("Number " + num + " is Not Odd and Negative.");
        }
        else if ( num % 2 == 0 && num < 0 ) {
            System.out.println("Number " + num + " is Not Odd but Negative.");
        }
        else {
            System.out.println("Number " + num + " is Odd but Not Negative.");
        }


    }

}
