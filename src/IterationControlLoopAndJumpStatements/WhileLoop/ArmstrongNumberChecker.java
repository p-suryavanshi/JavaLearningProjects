package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Armstrong Number Checker ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while ( temp > 0) {
            count++;
            temp /= 10;
        }

        int i = num;
        int sum = 0;

        while ( i > 0 ) {
            int lastDigit = i % 10;
            sum += (int) Math.pow(lastDigit,count);
            i /= 10;
        }

        if ( num == sum ) {
            System.out.println("Number " + num + " is an Armstrong Number.");
        } else {
            System.out.println("Number " + num + " is Not an Armstrong Number.");
        }

    }

}
