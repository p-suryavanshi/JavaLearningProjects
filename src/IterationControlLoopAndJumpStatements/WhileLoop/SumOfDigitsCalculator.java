package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class SumOfDigitsCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Sum of Digits Calculator ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int i = num;
        int sumOfDigits = 0;

        while ( i > 0 ) {
            int lastDigit = i % 10;
            sumOfDigits += lastDigit;
            i /= 10;
        }

        System.out.println("Sum of Digits of Number " + num + " is: " + sumOfDigits);

    }

}
