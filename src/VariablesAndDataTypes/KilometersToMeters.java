package Basic;
import java.util.*;

public class KilometersToMeters {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Kilometers to Meters Converter ---\n");

        System.out.print("Please enter the Kilometer: ");
        float km = input.nextFloat();

        double meter = km * 1000;

        System.out.println("Kilometer " + km + " is Converted into Meter: " + meter);

    }

}
