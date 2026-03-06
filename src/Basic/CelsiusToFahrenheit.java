package Basic;

import java.util.*;

public class CelsiusToFahrenheit {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Celsius to Fahrenheit Converter ---\n");

        System.out.print("Please enter the Temperature in Celsius: ");
        float celsius = input.nextFloat();

        double fahrenheit = ( celsius * 9/5 ) + 32 ;

        System.out.println("\nThe Temperature in Fahrenheit is: " + fahrenheit );

    }

}
