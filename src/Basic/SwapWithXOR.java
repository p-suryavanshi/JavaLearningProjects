package Basic;

import java.util.*;

public class SwapWithXOR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Program of Swaping Two Numbers With BitWise XOR  Operator ***\n");

        System.out.print("Please enter First Number to Swap: ");
        int num1 = input.nextInt();

        System.out.print("Now enter Second number to Swap: ");
        int num2 = input.nextInt();

        System.out.println("\n--- Before Swaping ---");
        System.out.println("First Number: " + num1 + "\nSecond Number: " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("\n--- After Swaping ---");
        System.out.println("First Number: " + num1 + "\nSecond Number: " + num2);

    }

}