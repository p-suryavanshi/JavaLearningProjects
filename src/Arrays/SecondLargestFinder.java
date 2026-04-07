package Arrays;
import java.util.Scanner;

public class SecondLargestFinder {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("\n*** Welcome to the Second Largest Finder ***\n");

        System.out.print("Please enter the size of Array: ");
        int size = sc.nextInt();

        double []prices = new double[size];
        for (int i = 0; i < prices.length; i++) {
            System.out.print("Please enter the Price: ");
            prices[i] = sc.nextDouble();
        }

        double max = 0;
        double secondMax = 0;
        for (int j = 0; j < prices.length; j++) {
           if (prices[j] > max) {
               secondMax = max;
               max = prices[j];
           } else if (prices[j] < max) {
               secondMax = prices[j];
           }
        }

        System.out.println("Second Largest Price is: " + secondMax );

    }

}