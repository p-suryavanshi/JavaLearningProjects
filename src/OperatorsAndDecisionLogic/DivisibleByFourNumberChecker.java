package OperatorsAndDecisionLogic;
import java.util.Scanner;

public class DivisibleByFourNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Number Checker Number is Divisible by 4 OR Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 4 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 4.");
        }
        else {
            System.out.println("Number " + num + " is not Divisible by 4.");
        }

    }

}
