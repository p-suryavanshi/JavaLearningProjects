package VariablesAndDataTypes;

import java.util.*;

public class FahrenheitToCelsius {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Fahrenheit to Celsius Converter ---\n");

        System.out.println("Please enter the Temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println("The temperature after converting Fahrenheit to  Celsius: " + celsius );

    }

}
