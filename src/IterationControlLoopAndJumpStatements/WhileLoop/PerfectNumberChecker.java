package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class PerfectNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Perfect Number Checker ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;
        while ( i <= num-1 ) {

            if (num % i == 0) {
                sum += i;
            }

            i++;
        }

        if ( num == sum) {
            System.out.println("Number " + num + " is Perfect Number.");
        } else {
            System.out.println("Number " + num + " is Not Perfect Number.");
        }

    }

}
