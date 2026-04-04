package Arrays;
import java.util.Scanner;

public class AnalyticsMaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Analytics Master ---\n");

        System.out.print("How many item you want: ");
        int size = sc.nextInt();

        double prices[] = new double[size];
        double max = 0;

        double sumOfPrice = 0;
        for (int i = 0; i <= size-1; i++) {

            System.out.print("Please enter the Price :");
            prices[i] = sc.nextDouble();

            max = prices[0];
            sumOfPrice += prices[i];

            if (prices[i] > max) {
                max = prices[i];
            }

        }

        System.out.println("\n--- TOTAL BILL ---");
        System.out.println(sumOfPrice + "$");
        System.out.println("\n--- HIGHEST PRICE ---");
        System.out.println(max + "$");

    }

}