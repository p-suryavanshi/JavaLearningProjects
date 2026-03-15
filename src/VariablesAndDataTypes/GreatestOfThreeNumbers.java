package VariablesAndDataTypes;

import java.util.*;

public class GreatestOfThreeNumbers {

    //creating numbers method to take numbers from the user
    public static int numbers(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        return number;
    }

    public static void main() {

        //Print Greeting massage for the user
        System.out.println("\n--- Welcome to the Greatest of three numbers checker ---\n");

        //Declaring num1,num2,num3 for taking 3 numbers from the user by calling numbers function
        int num1 = numbers();
        int num2 = numbers();
        int num3 = numbers();

        //Applying if else condition for finding greatest of three numbers
        if ( num1 > num2 && num1 > num3 ){
            System.out.println("\nThe Greatest number is: " + num1 + " (in first row)" );
        } else if ( num2 > num3) {
            System.out.println("\nThe Greatest number is: " + num2 + " (in second row)" );
        } else {
            System.out.println("\nThe Greatest number is: " + num3 + " (in third row)" );
        }

    }

}
