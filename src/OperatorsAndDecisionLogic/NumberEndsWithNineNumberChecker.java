package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberEndsWithNineNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number ends with 9 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 10 == 9 ) {
            System.out.println("Number " + num + " ends with 9.");
        }
        else {
            System.out.println("Number " + num + " do Not ends with 9.");
        }

    }

}
