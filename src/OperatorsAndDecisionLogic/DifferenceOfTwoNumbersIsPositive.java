package OperatorsAndDecisionLogic;
import java.util.*;

public class DifferenceOfTwoNumbersIsPositive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Difference of Two Numbers is Positive or Not ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        int difference = firstNum - secondNum;

        if ( difference > 0 ) {
            System.out.println("Difference of Two Numbers " + firstNum + " and " + secondNum + " is: " + difference + " is Positive." );
        }
        else {
            System.out.println("Difference of Two Numbers " + firstNum + " and " + secondNum + " is: " + difference + " is Not Positive.");
        }

    }

}
