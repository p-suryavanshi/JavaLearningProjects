package OperatorsAndDecisionLogic;
import java.util.*;

public class NumberIsDivisibleBySevenOrEleven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker a Number is Divisible by 7 OR 11 ***\n");

        System.out.print("Please emter a Number: ");
        int num = input.nextInt();

        if ( num % 7 == 0 || num % 11 == 0 ) {
            System.out.println("Number " + num + " is Divisible by 7 or 11.");
        } else {
            System.out.println("Number " + num + " is Not Divisible by 7 or 11.");
        }

    }

}
