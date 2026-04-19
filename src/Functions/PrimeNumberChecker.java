package Functions;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean PrimeNumber(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Prime Number Checker ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Number " + num + " is Prime: " + PrimeNumber(num));

    }

}