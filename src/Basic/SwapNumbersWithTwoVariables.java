package Basic;

import java.util.*;

public class SwapNumbersWithTwoVariables {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Swap Numbers Calculator ---\n");

        System.out.print("Enter First number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();

        System.out.println("After Swap First Number : " + num2);

        num2 = num1;
        System.out.println("After Swap Second Number : " + num2 );

    }

}
