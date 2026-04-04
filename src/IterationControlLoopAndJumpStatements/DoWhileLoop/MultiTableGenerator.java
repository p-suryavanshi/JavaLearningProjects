package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class MultiTableGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Multi Table Generator ***\n");

        char choice;
        do {

            System.out.print("Please enter the Number: ");
            int num = sc.nextInt();

            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " X " + num + " = " + (j * num));
            }

            System.out.print("Do you want Table for another Number(Y/N): ");
            choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                System.out.println("You have exited the Program.");
            }

        } while ( choice == 'y' || choice == 'Y' );

    }

}