package OperatorsAndDecisionLogic;
import java.util.*;

public class SmallestOfTwoNumbersFinder {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smallest of Two Numbers Finder ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        if ( firstNum < secondNum ){
            System.out.println("First Number " + firstNum + " is Smallest.");
        } else {
            System.out.println("Second Number " + secondNum + " is Smallest.");
        }

    }

}
