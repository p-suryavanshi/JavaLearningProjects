package VariablesAndDataTypes;
import java.util.*;

public class SumOfFiveNumbers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- welcome to the Sum of Five Numbers Calculator ---\n");

        System.out.print("Please enter the First Numbers To Calculate Sum: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the Second Numbers To Calculate Sum: ");
        int num2 = input.nextInt();
        System.out.print("Please enter the Third Numbers To Calculate Sum: ");
        int num3 = input.nextInt();
        System.out.print("Please enter the Fourth Numbers To Calculate Sum: ");
        int num4 = input.nextInt();
        System.out.print("Please enter the Fifth Numbers To Calculate Sum: ");
        int num5 = input.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("The Sum of your given five Numbers is: " + sum );

    }

}
