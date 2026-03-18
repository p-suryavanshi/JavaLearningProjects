package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByTwoOrFiveButNotBoth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 2 or 5 But Not by Both ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num % 5 == 0 ) {
            System.out.println("Number " + num + " is Divisible by Both 2 and 5.");
        } else if ( num % 2 == 0 || num % 5 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 2 or 5 but not Both.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by 2 or 5.");
        }

    }

}
