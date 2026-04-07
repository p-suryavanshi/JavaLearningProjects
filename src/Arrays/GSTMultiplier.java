package Arrays;
import java.util.Scanner;

public class GSTMultiplier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the GST Multiplier ===\n");

        double []prices = new double[5];

        for (int i = 0; i < prices.length; i++) {
            System.out.print("Please enter the Price: ");
            prices[i] = sc.nextDouble();
        }

        System.out.println("\nPrice After Adding 18% GST\n");
        for (int k = 0; k < prices.length; k++) {
            double totalAmount = prices[k] + (prices[k] * 0.18);
            System.out.println("Price " + totalAmount);
        }

    }

}