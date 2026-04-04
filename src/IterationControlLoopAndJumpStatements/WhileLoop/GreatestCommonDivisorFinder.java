package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class GreatestCommonDivisorFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Greatest Common Divisor ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Now, enter the Second Number: ");
        int secondNum = sc.nextInt();

        int n1 = firstNum;
        int n2 = secondNum;

        int gcd = 1;
        int i = 1;

        while (firstNum != secondNum) {

            if (firstNum > secondNum ) {
                gcd = firstNum -= secondNum;
            } else {
                gcd = secondNum -= firstNum;
            }

            i++;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);

    }

}
