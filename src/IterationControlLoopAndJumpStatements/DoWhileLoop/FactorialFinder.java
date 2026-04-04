package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class FactorialFinder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Factorial Finder ***\n");

        char choice;
        do {
            System.out.print("Please enter the Number: ");
            int num = sc.nextInt();

            int fact = 1;
            for (int i = num; i >= 1; i--) {
                 fact *= i;
            }

            System.out.println("Factorial of Number " + num + " is: " + fact);

            System.out.print("Check another number? (y/n)");
            choice = sc.next().charAt(0);

            while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N'){
                System.out.println("Wrong Choice! Please Try Again Enter Only Y or N.");
                System.out.print("Check another number? (Y/N): ");
                choice = sc.next().charAt(0);
            }

            if (choice == 'n' || choice == 'N') {
                System.out.println("You have Exited the Program..");
            }


        } while (choice == 'y' || choice == 'Y');
    }

}