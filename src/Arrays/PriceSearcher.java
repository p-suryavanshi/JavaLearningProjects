package Arrays;
import java.util.*;

public class PriceSearcher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Price Searcher ===\n");

        double []prices = {123,345,45.56,6436,32534,23523,21,4,34,352};

        System.out.print("Which Price you want to Find: ");
        double targetPrice = sc.nextDouble();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < prices.length; i++) {
            if (targetPrice == prices[i]) {
                found = true;
                position = i +1;
                break;
            }
        }

        if (found) {
            System.out.println("Item found at " + position);
        } else {
            System.out.println("Price Not Found!");
        }

    }

}