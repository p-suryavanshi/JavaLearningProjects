package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class FactorialFinder {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Factorial Finder ***\n");

        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        double fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

    }

}
