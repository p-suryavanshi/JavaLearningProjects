package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Palindrome Number Checker ***\n");

        System.out.print("Please enter the Numeber: ");
        int num = sc.nextInt();

        int reverse = 0;

        for ( int i = num; i > 0; i /= 10 ) {
            int lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }

        if (num == reverse) {
            System.out.println("Number " + num + " is Palindrome.");
        } else {
            System.out.println("Number " + num + " is Not Palindrome.");
        }

    }

}