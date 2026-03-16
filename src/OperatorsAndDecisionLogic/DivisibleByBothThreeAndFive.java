package OperatorsAndDecisionLogic;
import java.util.*;

public class DivisibleByBothThreeAndFive {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Number is Divisible by Both 3 & 5 Or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("Number " + num + " is Divisible by Both 3 & 5.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by Both 3 & 5.");
        }


    }

}
