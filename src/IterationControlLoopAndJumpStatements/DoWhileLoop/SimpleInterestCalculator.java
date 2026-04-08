package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class SimpleInterestCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Simple Interest Calculator ***");

        char choice;
        do {

            System.out.print("\nPlease enter the Principle Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Now Enter the Interest Rate of Year: ");
            double interestRate = sc.nextDouble();
            System.out.print("Now, enter the Total Time in Years: ");
            double time = sc.nextDouble();

            double simpleInterest = (amount * interestRate * time) / 100;

            System.out.println("Simple Interest is: " + simpleInterest);

            System.out.print("Calculate for Another Number (Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                System.out.println("You have exited the Program..");
                break;
            }

        } while (choice == 'Y' || choice == 'y');

    }

}