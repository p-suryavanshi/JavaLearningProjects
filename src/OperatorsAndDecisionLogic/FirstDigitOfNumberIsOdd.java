package OperatorsAndDecisionLogic;
import java.util.*;

public class FirstDigitOfNumberIsOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker First Digit of a Number is Odd or Not ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        int firstDigit = (num + "").charAt(0) - '0';

        if ( firstDigit % 2 != 0 ) {
            System.out.println("First Digit " + firstDigit + " of the Number " + num + " is Odd.");
        }
        else {
            System.out.println("First Digit " + firstDigit + " of the Number " + num + " is Not Odd.");
        }

    }

}
