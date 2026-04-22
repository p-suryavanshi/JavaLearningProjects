package Functions.Recursion;
import java.util.Scanner;

public class FactorialFinder {

    public static long Factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * Factorial(n-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Factorial Finder ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of Number " + num + " is: " + Factorial(num));

    }

}