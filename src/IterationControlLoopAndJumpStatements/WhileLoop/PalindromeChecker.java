package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Palindrome Checker ***\n");

        System.out.print("Please enter the Value to Check Palindrome: ");
        int num = sc.nextInt();

        int i = num;
        String reverse = "";

        while ( i > 0 ) {
            int lastDigit = i % 10;
            reverse += lastDigit;
            i /= 10;
        }

        int finalReversed = Integer.parseInt(reverse);

        if ( finalReversed == num ) {
            System.out.println("Number " + num + " is Palindrome.");
        } else {
            System.out.println("Number " + num + " is Not Palindrome.");
        }

    }

}
