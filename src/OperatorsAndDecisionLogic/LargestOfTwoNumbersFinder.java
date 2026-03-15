package OperatorsAndDecisionLogic;
import java.util.*;

public class LargestOfTwoNumbersFinder {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** welcome to the Largest of Two Numbers Finder ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        if ( firstNum > secondNum ){
            System.out.println("First number " + firstNum + " is Largest.");
        } else {
            System.out.println("Second number " + secondNum + " is Largest.");
        }

    }

}
