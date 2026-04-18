package Functions;
import java.util.Scanner;

public class GSTCalculator {

    public static double Gst(double price) {

        return price *= 0.18;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the GST Calculator ===\n");

        System.out.print("Please enter the Price: ");
        double price = sc.nextInt();

        System.out.println("\nPrice After Adding 18% GST: " + (price + Gst(price)) + "Rs" );

    }

}