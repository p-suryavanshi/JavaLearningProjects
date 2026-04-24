package Functions.Recursion;
import java.util.Scanner;

public class PowerCalculator {

    public static int Power(int n, int p) {

        if (p == 0) {
            return 1;
        }

        return n * Power(n, p - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Power Calculator ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();
        System.out.print("Now, enter the power: ");
        int power = sc.nextInt();

        System.out.println("\nPower of Number " + num + " is: " + Power(num,power));

    }

}