package Basic;

import java.util.*;

public class AddTwoIntergers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Additing two intergers and printing the result program ---\n");

        System.out.println("Please enter first interger number to add: ");
        int num1 = input.nextInt();

        System.out.println("Now, enter the second interger number to add: ");
        int num2 = input.nextInt();

        int add = num1 + num2;

        System.out.println("\nThe result of additing two intergers is: " + add);

    }

}
