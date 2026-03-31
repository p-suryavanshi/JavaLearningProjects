package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class ArmstrongNumberChecker {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Armstrong Number Checker ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for ( int i = num; i > 0; i /= 10 ) {
            int digit = i % 10;
            sum += digit * digit * digit;
        }

        if ( num == sum ) {
            System.out.println(num + " is Armstrong Number");
        } else {
            System.out.println(num + " is Not Armstrong Number");
        }

    }

}
