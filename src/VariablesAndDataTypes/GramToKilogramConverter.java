package VariablesAndDataTypes;
import java.util.*;

public class GramToKilogramConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Gram to Kilogram Converter\n");

        System.out.print("Please enter the Grams you want to convert into Kilograms: ");
        double gram = input.nextDouble();

        double kiloGram = gram / 1000;

        System.out.println("Your Gram " + gram + " is converted into Kilogram: " + kiloGram + "Kg");
    }

}
