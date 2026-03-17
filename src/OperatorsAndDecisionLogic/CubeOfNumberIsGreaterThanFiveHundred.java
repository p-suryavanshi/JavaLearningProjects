package OperatorsAndDecisionLogic;
import java.util.*;

public class CubeOfNumberIsGreaterThanFiveHundred {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker Cube of a Number is Greater than 500 or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num * num * num > 500 ) {
            System.out.println("Cube of the Number " + num + " is Greater than 500.");
        }
        else {
            System.out.println("Cube of the Number " + num + " is Not Greater than 500.");
        }

    }

}
