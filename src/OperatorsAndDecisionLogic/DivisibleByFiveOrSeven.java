package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByFiveOrSeven {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 5 or 7 ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num % 5 == 0 || num % 7 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 5 Or 7.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by 5 Or 7.");
        }


    }

}
