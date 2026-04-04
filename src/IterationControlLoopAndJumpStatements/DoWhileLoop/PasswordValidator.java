package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Password Validator ***\n");

        int password = 1234;
        int pass;

        do {

            System.out.print("Please enter the Password: ");
            pass = sc.nextInt();

            switch (pass) {
                case 1234 :
                    System.out.println("You have entered Correct Password.");
                    break;
                default :
                    System.out.println("Please Try Again!");
            }

        } while (password != pass);

    }

}
