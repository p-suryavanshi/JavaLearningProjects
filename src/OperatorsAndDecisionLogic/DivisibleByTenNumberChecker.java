package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByTenNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Number Checker Number is Divisible by 10 or Not ===\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 10 == 0){
            System.out.println("Number " + num + " is Divisible by 10.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 10.");
        }
    }

}
