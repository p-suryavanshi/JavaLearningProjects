package VariablesAndDataTypes;
import java.util.*;

public class SquareOfNumber {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome To the Square of a Number Finder ---\n");

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int square = num * num;

        System.out.println("The Square of your given number is: " + square );

    }

}
