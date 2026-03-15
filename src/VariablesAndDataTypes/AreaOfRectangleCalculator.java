package VariablesAndDataTypes;

import java.util.*;

public class AreaOfRectangleCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Area of Rectangle Calculator ---\n");

        System.out.print("Please enter the length of the rectangle: ");
        float length = input.nextFloat();

        System.out.print("Now, enter the width of the rectangle: ");
        float width = input.nextFloat();

        float  area = length * width;

        System.out.println("\nThe area of your rectangle is: "  + area);

    }

}
