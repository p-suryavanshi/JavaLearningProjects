package OperatorsAndDecisionLogic;
import java.util.*;

public class PositiveNegativeNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Positive Negative Number checker ***\n");

        System.out.print("Please enter the Number you want to check: ");
        int num = input.nextInt();

        if ( num >= 0 ){
            System.out.println("Number is Posivive.");
        } else {
            System.out.println("Number is Negative.");
        }

    }

}
