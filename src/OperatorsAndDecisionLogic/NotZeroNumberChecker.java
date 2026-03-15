package OperatorsAndDecisionLogic;
import java.util.Scanner;

public class NotZeroNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Zero or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num == 0 ) {
            System.out.println("Number " + num + " is Zero.");
        }
        else {
            System.out.println("Number " + num + " is Not Zero.");
        }

    }

}
