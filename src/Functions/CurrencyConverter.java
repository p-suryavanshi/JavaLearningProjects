package Functions;
import java.util.Scanner;

public class CurrencyConverter {

    public static double inUsd(double curr) {

        double usd = curr / 92.60;

        return usd;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Currency Converter from Rs to Usd ===\n");

        System.out.print("Please enter Rupees: ");
        double rupee = sc.nextInt();

        System.out.println("Rupees " + rupee + " is Converted into Usd: " + inUsd(rupee));

    }


}