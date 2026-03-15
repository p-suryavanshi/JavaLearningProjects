package OperatorsAndDecisionLogic;
import java.util.Scanner;

public class DivisibleByFiveNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 5 or Not ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();;

        if ( num % 5 == 0 ){
            System.out.println("Number " + num + " is Divisible by 5.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by 5.");
        }
    }

}
