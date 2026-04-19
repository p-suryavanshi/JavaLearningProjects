package Functions;
import java.util.Scanner;

public class FactorialCalculator {

    public static long Factorial(int num) {

        long fact = 1;

        for (int i = num; i > 0; i--) {
            fact *= i;
        }

        return fact;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Factorial Calculator ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        System.out.println("\nFactorial of Number " + num + " is: " + Factorial(num));

    }

}