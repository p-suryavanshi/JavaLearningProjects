package OperatorsAndDecisionLogic;
import java.util.*;

public class EqualTwoNumbersChecker {

    static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Two Equal Numbers Checker ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the second Number: ");
        int secondNum = input.nextInt();

        if ( firstNum == secondNum){
            System.out.println("Both Numbers " + firstNum + " and " + secondNum + " are Equal.");
        } else {
            System.out.println("Numbers " + firstNum + " and " + secondNum + " are not Equal");
        }

    }

}
