package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Average Calculator ***\n");

        int num;
        int count = 0;
        int sum = 0;
        char choice;
        do {
            System.out.print("Please enter the Number: ");
            num = sc.nextInt();

            sum += num;
            count++;

            System.out.print("Do you want to enter Number Again (Y/N)");
            choice = sc.next().charAt(0);


        }while ( choice == 'y' || choice == 'Y');

        int average = sum / count;

        System.out.println("Average of Your given Number is: " + average );

    }

}