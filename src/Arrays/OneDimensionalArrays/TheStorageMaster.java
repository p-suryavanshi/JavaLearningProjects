package Arrays.OneDimensionalArrays;
import java.util.Scanner;

public class TheStorageMaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Storage Master ---\n");

        System.out.print("How many items' prices do you want to store?: ");
        int size = sc.nextInt();

        double prices[] = new double[size];

        for (int i = 0; i <= size-1; i++) {
            System.out.print("Please enter the Price of item: ");
            prices[i] = sc.nextDouble();
        }

        for (int j = 0; j <= size-1; j++) {
            System.out.println(prices[j]);
        }

    }

}