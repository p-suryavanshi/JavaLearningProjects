package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByTwoThreeAndFiveNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by 2 , 3 and 5 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num % 3 == 0 && num % 5 ==0   ) {
            System.out.println("Number " + num + " is Divisible by 2, 3 & 5.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by 2, 3 & 5.");
        }

    }

}
