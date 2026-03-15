package OperatorsAndDecisionLogic;
import java.util.Scanner;

public class DivisibleByEightNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 8 OR Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 8 == 0) {
            System.out.println("Number " + num + " is Divisible by 8.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 8.");
        }

    }
}
