package OperatorsAndDecisionLogic.ProjectFour;
import java.util.*;

public class SmartNumberClassifier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smart Number Classifier *** \n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        //Number is Even or Odd
        if ( by2 ) {
            System.out.println("Number " + num + " is: Even");
        } else {
            System.out.println("Number " + num + " is: Odd");
        }

        //Number is Positive Negative or Zero
        if ( num > 0 ) {
            System.out.println("Number " + num + " is: Positive");
        } else if ( num < 0 ) {
            System.out.println("Number " + num + " is: Negative");
        } else {
            System.out.println("Number " + num + " is: Zero");
        }

        //Divisible by 2,3,5 or Not
        if ( !by2 && !by3 && !by5 ) {
            System.out.println("Number "  + num + " is Divisible by: None");
        } else if ( by2 && by3 && by5){
            System.out.println("Number " + num + " is Divisible by: 2,3,5");
        } else if ( by2 && by3 ) {
            System.out.println("Number " + num + " is Divisible by: 2,3");
        } else if ( by2 && by5 ) {
            System.out.println("Number " + num + " is Divisible by: 2,5");
        } else if (by3 && by5) {
            System.out.println("Number " + num + " is Divisible by: 3,5");
        } else if (by2) {
            System.out.println("Number " + num + " is Divisible by: 2");
        } else if ( by3 ) {
            System.out.println("Number " + num + " is Divisible by: 3");
        } else {
            System.out.println("Number " + num + " is Divisible by: 5");
        }

        //Exctly One of 2,3,5
        if ( (by2 && !by3 && !by5) || (!by2 && by3 && !by5) || (!by2 && !by3 && by5) ) {
            System.out.println("Number " + num + " is Divisible by Exactly One: Yes");
        } else {
            System.out.println("Number " + num + " is Divisible by Exactly One: No");
        }

        //Exactly Two of 2,3,5
        if ( (by2 && by3 && !by5) || ( by2 && !by3 && by5 ) || ( !by2 && by3 && by5 ) ) {
            System.out.println("Number is Divisible by Exatly Two: Yes");
        } else {
            System.out.println("Number is Divisible by Exactly Two: No");
        }

        //None of 2,3,5
        if ( !by2 && !by3 && !by5 ) {
            System.out.println("Number " + num + " is Divisible by None: Yes");
        } else {
            System.out.println("Number " + num + " is Divisible by None: No");
        }

        //Prime Number
        System.out.println("Prime: Skipped");

        //Perfect Square
        if ( num == 1 || num == 4 || num == 9 || num == 16 || num == 25 || num == 36 || num == 49 || num == 64 || num == 81 || num == 100 ) {
            System.out.println("Number " + num +  " is Perfect Square: Yes");
        } else {
            System.out.println("Number " + num + " is Perfect Square: No");
        }

    }

}