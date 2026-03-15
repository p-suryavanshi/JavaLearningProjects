package VariablesAndDataTypes;
import java.util.*;

public class KelvinToCelsiusTemperatureConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Temperature Converter from Kelvin to Celsiud ***\n");

        System.out.print("Please enter the Temperature in Kelvin: ");
        double kelvin = input.nextInt();

        double celsius = kelvin - 273.15;

        System.out.printf("Temperature in Celsius is: %.2f%n" , celsius , "C" );

    }

}
