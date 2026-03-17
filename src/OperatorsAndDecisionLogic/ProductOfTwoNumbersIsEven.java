package OperatorsAndDecisionLogic;
import java.util.*;

public class ProductOfTwoNumbersIsEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Product of Two Numbers is Even or not ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        int product = firstNum * secondNum;

        if ( product % 2 == 0) {
            System.out.println("Product of Two Numbers " + firstNum + " and " + secondNum + " is " + product + " is Even.");
        }
        else {
            System.out.println("Product of Two Numbers " + firstNum + " and " + secondNum + " is " + product + " is Not Even.");
        }
    }

}
