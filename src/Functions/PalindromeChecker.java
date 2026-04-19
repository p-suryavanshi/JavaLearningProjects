package Functions;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean Palindrome(int n) {

        int palindrome = n;
        int rev = 0;

        for (int i = n; i > 0; i /= 10) {
            int lastDigit = i % 10;
            rev = (rev * 10) + lastDigit;
        }

        if ( rev == palindrome ) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Palindrome Checker ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Number " + num + " is Palindrome: " + Palindrome(num));

    }

}