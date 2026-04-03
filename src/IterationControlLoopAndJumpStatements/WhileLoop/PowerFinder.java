package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class PowerFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Power Finder ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        System.out.print("Now, enter the power of the Number: ");
        int power = sc.nextInt();

        int i = 1;
        int result = 1;
        while ( i <= power) {
            result *= num;
            i++;
        }

        System.out.println("Result is: " + result);

    }

}
