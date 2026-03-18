package OperatorsAndDecisionLogic.ProjectOne;
import java.util.*;

public class SmartNumberAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smart Number Analyzer ***\n");

        //Taking number as a input from user
        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        //Number is Even or Odd Checking
        if ( num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        //Number is Positive, Negative or Zero Checking
        if ( num > 0) {
            System.out.println("Positive");
        } else if ( num < 0 ) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //Divisible by 2,3,5

    }

}
