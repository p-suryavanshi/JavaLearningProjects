package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByTwoOrThree {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 2 Or 3 OR Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num % 3 == 0){
            System.out.println("Number " + num + " is Divisible by 2 or 3.");
        }
        else if ( num % 2 == 0){
            System.out.println("Number " + num + " is Divisible by 2.");
        } else if ( num % 3 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 3.");
        }
        else {
            System.out.println("Number " + num + " is Not Divisible by 2 or 3.");
        }

    }

}
