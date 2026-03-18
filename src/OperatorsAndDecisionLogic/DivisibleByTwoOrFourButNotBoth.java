package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByTwoOrFourButNotBoth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 2 or 4 but Not by Both ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num % 4 != 0 ) {
            System.out.println("Number " + num + " is Divisible by 2 or 4 but Not by Both.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 2 or 4.");
        }

    }

}
