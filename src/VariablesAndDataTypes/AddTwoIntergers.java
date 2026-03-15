package VariablesAndDataTypes;

import java.util.*;

public class AddTwoIntergers {

    public static void main(String a[] ) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Additing two intergers and printing the result program ---\n");

        System.out.print("Please enter first interger number to add: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter the second interger number to add: ");
        int num2 = input.nextInt();

        int add = num1 + num2;

        System.out.println("\nThe result of additing two intergers is: " + add);

    }

}
