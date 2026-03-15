package VariablesAndDataTypes;
import java.util.*;

public class CircumferenceOfCircleCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Circumference Of a Circle Calculator ---\n");

        System.out.print("Please enter the radius of your circle: ");
        int radius = input.nextInt();

        double circumference = 2 * 3.14159 * radius;

        System.out.println("The Circumference of your circle is: " + circumference);
    }

}
