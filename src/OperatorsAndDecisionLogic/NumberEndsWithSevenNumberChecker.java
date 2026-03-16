package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberEndsWithSevenNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number Ends with 7 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 10 == 7 ) {
            System.out.println("Number " + num + " ends with 7.");
        }
        else {
            System.out.println("Number " + num + " do Not ends with 7.");
        }


    }

}
