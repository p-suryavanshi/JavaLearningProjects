package OperatorsAndDecisionLogic.ProjectOne;
import java.util.*;

public class SmartNumberAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smart Number Analyzer ***\n");

        //Taking number as a input from user
        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        //Number is Even or Odd Checking
        if ( by2) {
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
        if ( by2 && by3 && by5 ) {
            System.out.println("Divisible by: 2,3,5");
        } else if ( by2 && by3 ) {
            System.out.println("Divisible by: 2,3");
        } else if ( by2 && by5) {
            System.out.println("Divisible by: 2,5");
        } else if ( by3 && by5 ) {
            System.out.println("Divisible by: 3,5");
        } else if ( by2 ) {
            System.out.println("Divisible by: 2");
        } else if ( by3 ) {
            System.out.println("Divisible by: 3");
        } else if ( by5 ) {
            System.out.println("Divisible by: 5");
        } else {
            System.out.println("Divisible by: None");
        }

        //Exactly one of 2,3,5
        if ( (by2 && !by3 && !by5) || (!by2 && by3 && !by5) || (!by2 && !by3 && by5)) {
            System.out.println("Exactly One: Yes");
        } else {
            System.out.println("Exactly One: No");
        }

        //None of 2,3,5
        if ( !by2 && !by3 && !by5) {
            System.out.println("None: Yes");
        } else {
            System.out.println("None: No");
        }

    }

}