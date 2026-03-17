package OperatorsAndDecisionLogic;
import java.util.*;

public class SquareOfNumberIsGreaterThanHundred {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Square of a Number is Greater than 100 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num * num > 100 ) {
            System.out.println("Square of the Number " + num + " is Greater than 100.");
        }
        else {
            System.out.println("Square of the Number " + num + " is Not Greater than 100.");
        }

    }

}
