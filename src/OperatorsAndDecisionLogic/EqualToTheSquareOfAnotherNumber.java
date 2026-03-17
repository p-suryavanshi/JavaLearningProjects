package OperatorsAndDecisionLogic;
import java.util.*;

public class EqualToTheSquareOfAnotherNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Number Checker a Number is Equal to the Square of Another Number ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        System.out.print("Now, enter the Another Number: ");
        int anotherNum = input.nextInt();

        if ( num == anotherNum * anotherNum ) {
            System.out.println("Number " + num + " is Equal to the Square of Another Number " + anotherNum );
        }
        else {
            System.out.println("Number " + num + " is Not Equal to the Square of Another Number " + anotherNum );
        }

    }

}
