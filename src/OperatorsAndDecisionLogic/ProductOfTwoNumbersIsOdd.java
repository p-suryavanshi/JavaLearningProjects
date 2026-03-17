package OperatorsAndDecisionLogic;
import java.util.*;

public class ProductOfTwoNumbersIsOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Product of Two Numbers is Odd or Not ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNumber = input.nextInt();

        int product = firstNumber * secondNumber;

        if ( product % 2 != 0 ) {
            System.out.println("Product of Two Numbers " + firstNumber + " and " + secondNumber + " is " + product + " is Odd.");
        }
        else {
            System.out.println("Product of Two Numbers " + firstNumber + " and " + secondNumber + " is " + product + " is Not Odd.");
        }

    }

}
