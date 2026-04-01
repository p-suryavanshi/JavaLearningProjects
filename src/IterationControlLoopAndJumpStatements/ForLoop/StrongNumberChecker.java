package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class StrongNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Strong Number Checker ***\n");

        System.out.print("Please enter the Number:  ");
        int num = sc.nextInt();

        int sum = 0;

        for ( int i = num; i > 0; i /= 10 ) {
            int digit = i % 10;
            int fact = 1;
            for ( int j = 1; j <= digit ; j++) {
                fact *= j;
            }
            sum += fact;
        }

        if (sum == num) {
            System.out.println(num + " is Strong Number");
        } else {
            System.out.println(num + " is Not Strong Number");
        }

    }

}
