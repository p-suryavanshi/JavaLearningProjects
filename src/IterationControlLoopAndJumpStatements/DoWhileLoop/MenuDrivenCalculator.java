package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class MenuDrivenCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to The Menu Driven Calculator ***");

        int choice;
        int num1,num2;

        do {

            System.out.println("\nEnter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Exit");
            System.out.print("\nPlease enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Please enter two Numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Addition of your given Number is: " + (num1 + num2));
                    break;
                case 2 :
                    System.out.println("Please enter two Numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("Subtraction of your given Number is: " + (num1 - num2));
                    break;
                case 3 :
                    System.out.println("You have Exited the Program...");
                    break;
                default :
                    System.out.println("You have Entered Invalid Value !Please Try Again");
            }

        } while (choice != 3);

    }

}
