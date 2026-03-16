package OperatorsAndDecisionLogic;
import java.util.*;

public class EvenAndPositiveNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Even And Positive ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num >= 0 ) {
            System.out.println("Number " + num + " is Even and Positive.");
        }
        else if ( num % 2 != 0 && num < 0 ){
            System.out.println("Number " + num + " is Not Even and Positive.");
        }
        else if ( num % 2 == 0 && num < 0){
            System.out.println("Number " + num + " is Even but Not Positive.");
        } else if ( num % 2 != 0 && num > 0) {
            System.out.println("Number " + num + " is Not Even But Positive.");
        }

    }

}
