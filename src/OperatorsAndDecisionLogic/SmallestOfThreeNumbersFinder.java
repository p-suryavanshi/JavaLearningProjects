package OperatorsAndDecisionLogic;
import java.util.*;

public class SmallestOfThreeNumbersFinder {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smallest Number Finder Between Three Numbers ***\n");

        System.out.print("Please enter First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        System.out.print("Now, enter the Third Number: ");
        int thirdNum = input.nextInt();

        if ( firstNum < secondNum && firstNum < thirdNum ) {
            System.out.println("First Number " + firstNum + " is the Smallest Number.");
        }
        else if ( secondNum < thirdNum ){
            System.out.println("Second Number " + secondNum + " is the Smallest Number.");
        }
        else {
            System.out.println("Third Number " + thirdNum + " is the Smallest Number.");
        }

    }

}
