package OperatorsAndDecisionLogic;
import java.util.Scanner;

public class DivisibleBySevenNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 7 Or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 7 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 7.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 7.");
        }


    }

}
