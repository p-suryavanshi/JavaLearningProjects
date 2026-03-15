package VariablesAndDataTypes;

import java.util.Scanner;

public class ReturnFunctiob {

    static void main(String[] args) {

        greet();
        addition();

    }

    public static void greet(){
        System.out.println("\n--- Welcome to the Pavan's Calculator ---\n");
    }

    public static int addition(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Now enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("The addition of two numbers is: " + sum );

        return sum;
    }

}
