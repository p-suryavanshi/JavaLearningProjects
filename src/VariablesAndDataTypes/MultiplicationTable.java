package Basic;

import java.util.*;

public class MultiplicationTable {

    public static void printMultiplicationTable(int number) {

        int i = 1;

        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + (number * i) );
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Multiplication table Calculator ---\n");

        System.out.print("Please enter a number whose Multiplication table you want to print: ");
        int number = input.nextInt();

        printMultiplicationTable(number);

    }

}
