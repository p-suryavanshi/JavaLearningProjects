package OperatorsAndDecisionLogic;
import java.util.*;

public class LastDigitOfNumberIsFiveChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Last Digit of a Number is 5 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 10 == 5 ) {
            System.out.println("Number " + num +  " have the Last Digit 5.");
        }
        else {
            System.out.println("Number " + num + " do Not have the Last Digit 5.");
        }

    }

}
