package Functions;
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double SimpleInterest(double p, double r, int t) {

        return (p * r * t) / 100;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Simple Interest Calculator ***\n");

        System.out.print("Please enter the Total Loan Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Now, enter Interest rate of per year in percentage: ");
        double interest = sc.nextDouble();
        System.out.print("Now, enter total time in years: ");
        int time = sc.nextInt();

        double result = SimpleInterest(amount,interest,time);
        System.out.println("\nTotal Interest Amount is: " + result);
        System.out.println("Total Payable Amount is: " + (amount + result));
    }

}