package Basic;
import java.util.*;

public class CelsiusToKelvinTemperatureConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Temperature Converter from Celsius to Kelvin ***\n");

        System.out.print("Please enter the Temperature in Celsius: ");
        double celsius = input.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("Celsius " + celsius + " is converted into Kelvin: " + kelvin );
    }

}
