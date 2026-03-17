package OperatorsAndDecisionLogic;
import java.util.*;

public class SumOfTwoNumbersIsEvenNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Sum of Two Numbers is Even ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;

        if ( sum % 2 == 0 ) {
            System.out.println("Sum of Two Numbers " + firstNum + " and " + secondNum + " is " + sum + " is Even.");
        }
        else {
            System.out.println("Sum of Two Numbers " + firstNum + " and " + secondNum + " is " + sum + " is Not Even.");
        }

    }

}
