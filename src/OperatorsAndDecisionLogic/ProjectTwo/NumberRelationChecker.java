package OperatorsAndDecisionLogic.ProjectTwo;
import java.util.*;

public class NumberRelationChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Relation Checker ***\n");

        System.out.print("Please enter First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        System.out.print("Now, enter the Third Number: ");
        int thirdNum = input.nextInt();

        int sum = firstNum + secondNum + thirdNum;
        int product = firstNum  * secondNum * thirdNum;
        int largest;
        int smallest;

        //Largest Number
        if ( firstNum > secondNum && firstNum > thirdNum ) {
            largest = firstNum;
            System.out.println("Largest Number is: " + firstNum );
        } else if ( secondNum > thirdNum ) {
            largest = secondNum;
            System.out.println("Largest Number is: " + secondNum );
        } else {
            largest = thirdNum;
            System.out.println("Largest Number is: " + thirdNum );
        }

        //Smallest Number
        if ( firstNum < secondNum && firstNum < thirdNum ) {
            smallest = firstNum;
            System.out.println("Smallest Number is: " + firstNum);
        } else if ( secondNum < thirdNum ) {
            smallest = secondNum;
            System.out.println("Smallest Number is: " + secondNum);
        } else {
            smallest = thirdNum;
            System.out.println("Smallest Number is: " + thirdNum);
        }

        //Middle Number
        int middle = sum - largest - smallest;
        System.out.println("Middle Number is: " + middle);

        //Sum VS Product
        if ( sum > product) {
            System.out.println("Sum is greater than Product");
        } else if ( sum < product ) {
            System.out.println("Sum is less than Product");
        } else {
            System.out.println("Sum is equal to Product");
        }

        //Check
        System.out.print("Is first number greater than both sum and product? ");
        if ( firstNum > sum && firstNum > product ) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");
        }
    }

}
