package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberIsDivisibleByFourButNotByEight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker a Number is Divisible by 4 but Not by 8 ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        if ( num % 4 == 0 && num % 8 != 0 ) {
            System.out.println("Number " + num + " is Divisible by 4 but Not by 8.");
        }
        else {
            System.out.println("number " + num + " is Not Divisible by 4 & 8.");
        }

    }

}
