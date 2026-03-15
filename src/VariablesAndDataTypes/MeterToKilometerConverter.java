package VariablesAndDataTypes;
import java.util.*;

public class MeterToKilometerConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Meter to Kilometer Converter ***\n");

        System.out.print("Please enter the Meter: ");
        double meter = input.nextDouble();

        double kiloMeter = meter / 1000;

        System.out.println("Meter " + meter + " is converted into Kilometer: " + kiloMeter + "KM");

    }

}
