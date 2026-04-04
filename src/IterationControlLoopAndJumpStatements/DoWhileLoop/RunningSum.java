package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class RunningSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Running Sum ***\n");

        int num;
        int sum = 0;

        do {
            System.out.print("Please enter the Number: ");
            num = sc.nextInt();

            sum += num;

            if (num == 0) {
                System.out.println("\nYou have exited the Program cause you have entered 0");
            }

        } while ( num != 0 );

        System.out.println("\nSum of Your Number is: " + sum);

    }

}