package OperatorsAndDecisionLogic;
import java.util.*;

public class MultipleOfTenNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is a Multiple of 10 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();


        if ( num % 10 == 0 ) {
            System.out.println("Number " + num + " is a Multiple of 10.");
        }
        else {
            System.out.println("Number " + num + " is Not a Multiple of 10.");
        }


    }

}
