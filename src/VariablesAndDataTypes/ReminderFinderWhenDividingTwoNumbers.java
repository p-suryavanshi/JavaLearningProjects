package VariablesAndDataTypes;
import java.util.*;

public class ReminderFinderWhenDividingTwoNumbers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Remainder Finder When Dividing Two Numbers ---\n");

        System.out.print("Please enter the First Number: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int num2 = input.nextInt();

        int division = num1 / num2 ;

        System.out.println("The Remainder of two numbers when dividing is: " +  division);

    }

}
