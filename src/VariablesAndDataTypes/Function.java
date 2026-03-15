package VariablesAndDataTypes;

import java.util.Scanner;
import java.lang.String;

public class Function {

    //Created greeting function
    public static void greeting(){
        System.out.println("\nHello Pavan");
    }

    //Created Addition function
    public static void addition(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter First number: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;

        System.out.println("The result of your given number is: " + add );

    }

    public static void printpattern(){

        int rows = 0;

        while ( rows < 5 ){
            System.out.print("*");

            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }

            System.out.println();

            rows++;
        }
    }

    public static void main(String[] args) {
        greeting();
        addition();
        printpattern();
    }


}
