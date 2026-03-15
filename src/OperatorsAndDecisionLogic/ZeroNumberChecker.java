package OperatorsAndDecisionLogic;
import java.util.*;

public class ZeroNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Zero Number Checker ***\n");

        System.out.print("Please enter the Number: ");
        int num = input.nextInt();

        if ( num == 0 ){
            System.out.println("Number " + num + " is Zero.");
        } else {
            System.out.println("Number " + num + " is not Zero.");
        }

    }

}
