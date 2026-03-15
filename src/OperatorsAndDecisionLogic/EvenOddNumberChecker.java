package OperatorsAndDecisionLogic;
import java.util.*;

public class EvenOddNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Even Odd Number Checker ***\n");

        System.out.print("Please enter The Number you want to Check: ");
        int num = input.nextInt();

        if (  num % 2 == 0){
            System.out.println("Your given Number is Even.");
        } else {
            System.out.println("Your Given Number is Odd.");
        }

    }

}
