package Arrays.OneDimensionalArrays;
import java.util.Scanner;

public class PriceFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Price Frequency Counter ***\n");

        double[] prices = new double[10];

        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Please enter the Price: ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("Which Price's Frequency do you want: ");
        double num = sc.nextDouble();

        for (double price : prices) {

            if (num == price) {
                count++;
            }

        }

        System.out.println("\nPrice " + num + " have " + count + " frequency.");

    }

}