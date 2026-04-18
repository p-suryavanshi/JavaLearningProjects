package Functions;
import java.util.Scanner;

public class EvenOddChecker {

    public static boolean EvenOdd(int num) {

        if (num % 2 == 0 ) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Even-Odd Checker ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        boolean result = EvenOdd(num);

        if (result) {
            System.out.println("\nNumber: " + num + " is Even.");
        } else {
            System.out.println("\nNumber: " + num + " is Odd.");
        }

    }

}