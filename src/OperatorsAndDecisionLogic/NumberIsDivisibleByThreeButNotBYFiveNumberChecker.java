package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberIsDivisibleByThreeButNotBYFiveNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker a Number is Divisible by 3 but not by 5 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 3 == 0 && num % 5 != 0 ) {
            System.out.println("Number " + num + " is Divisible by 3 but Not by 5.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 3 & 5.");
        }

    }

}
