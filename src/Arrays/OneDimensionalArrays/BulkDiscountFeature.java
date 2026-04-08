package Arrays.OneDimensionalArrays;
import java.util.Scanner;

public class BulkDiscountFeature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double []prices = {1243,324,346,546,234,256,645,780};

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Price: " + prices[i]);
        }

        System.out.print("\nWhich price item do you want please enter: ");
        double price = sc.nextDouble();

        double discount = 0;
        for (int j = 0; j < prices.length; j++) {
            if (price > 500) {
                discount = (prices[j] / 10);
            }
        }

        if ( price > 500 ) {
            System.out.println("\nCongrats You have Got 10% Discount "  + (price - discount) + " on Price " + price);
        } else {
            System.out.println("\nCongrtas You have buy the item on the price " + price);
        }

    }

}