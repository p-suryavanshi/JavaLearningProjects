package VariablesAndDataTypes;
import java.util.*;

public class MetersToCentimeters {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Meter to Centimeter Converter ---\n");

        System.out.print("Please enter the meter: ");
        double meter = input.nextDouble();

        double centimeter = meter * 100;

        System.out.println("Meter: " + meter + "m" + "  is converted into centimeter: " + centimeter + "cm");

    }

}
