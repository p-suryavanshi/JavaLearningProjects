package VariablesAndDataTypes;

import java.util.*;

public class MultiplyTwoFloatingNumbers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Multiplying two floating point numbers ---\n");

        System.out.print("Please enter a floating point number to multiply: ");
        float num1 = input.nextFloat();

        System.out.print("Now, enter the second number to multiply: ");
        float num2 = input.nextFloat();

        float mult = num1 * num2;

        System.out.println("\nThe result of your given number is: " + mult);

    }

}
