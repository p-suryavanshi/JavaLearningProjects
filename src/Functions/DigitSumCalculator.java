package Functions;
import java.util.Scanner;

public class DigitSumCalculator {

    public static int DigitSum(int n) {

        int sum = 0;

        for (int i = n; i > 0; i /= 10) {
            int lastDigit = i % 10;
            sum += lastDigit;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Digit Sum Calculator ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        int result = DigitSum(num);

        System.out.println("\nSum of Digits in Number " + num + " is: " + result);

    }

}