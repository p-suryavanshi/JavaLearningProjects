package Arrays;
import java.util.Scanner;

public class InventoryUpdater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Inventory Updater ***\n");

        double []prices = new double[5];

        for (int i = 0; i < prices.length; i++) {
            System.out.print("Please enter the Old Price: ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("\nNow, enter the Price you want to update: ");
        double oldPrice = sc.nextDouble();

        System.out.print("Now, enter the New Price: ");
        double newPrice = sc.nextDouble();

        System.out.println("\n=== Price is Updated ===");

        for (int j = 0; j < prices.length; j++) {
            if (oldPrice == prices[j]) {
                prices[j] = newPrice;
                System.out.println("Price: " + prices[j]);
            } else {
                System.out.println("Price: " + prices[j]);
            }
        }

    }

}