package Functions.Recursion;
import java.util.Scanner;

public class SumOfDigitsCalculator {

    public static int DigitSum(int n) {

        if (n == 0) {
            return 0;
        }

        int div = n / 10;
        int lastDigit = n % 10;

        return lastDigit + DigitSum(div);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Sum of Digits Calculator of a Number ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        System.out.println(DigitSum(num));

    }

}