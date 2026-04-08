package Arrays;
import java.util.*;

public class ParallelArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Parallel Array ***");

        String[] items = new String[3];
        double[] prices = new double[3];
        int minIndex = 0;

        for (int i = 0; i < items.length; i++) {
            System.out.print("\nPlease enter the item name: ");
            items[i] = sc.next();
            System.out.print("Now, enter the item Price: ");
            prices[i] = sc.nextDouble();

                if (prices[i] < prices[minIndex]) {
                    minIndex = i;
                }

        }

        System.out.println("\nSabse sasta item " + items[minIndex] + " hai, price: ₹" + prices[minIndex]);


    }

}