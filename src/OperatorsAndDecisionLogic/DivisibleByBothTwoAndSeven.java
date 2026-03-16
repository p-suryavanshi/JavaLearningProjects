package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByBothTwoAndSeven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by Both 2 & 7 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 2 == 0 && num % 7 == 0 ) {
            System.out.println("Number " + num + " is Divisible by Both 2 & 7.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by Both 2 & 7.");
        }


    }

}
