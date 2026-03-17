package OperatorsAndDecisionLogic;
import java.util.*;

public class SumOfTwoNumbersIsOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Sum of Two Numbers is Odd or Not ***\n");

        System.out.print("Please enter First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Please enter the Second Number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;

        if ( sum % 2 != 0 ) {
            System.out.println("Sum of Two Numbers " + firstNum + " and " + secondNum + " is " + sum + " is Odd.");
        }
        else {
            System.out.println("Sum of Two Numbers " + firstNum + " and " + secondNum + " is " + sum + " is Not Odd.");
        }

    }

}
