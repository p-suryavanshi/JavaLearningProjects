package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberIsGreaterThanTheAverageOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Greater than the Average of Two Numbers or Not ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        int averageNum = firstNum + secondNum / 2;

        if ( firstNum >  averageNum ) {
            System.out.println("Number " + firstNum + " is Greater than the Average of Two Numbers.");
        }
        else {
            System.out.println("Number " + secondNum + " is Greater than the Average of Two Numbers.");
        }

    }

}
