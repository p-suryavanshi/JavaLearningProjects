package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class LCMFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the LCM Finder ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Now, enter the Second Number: ");
        int secondNum = sc.nextInt();

        int i = 1;
        int lcm = 0;
        while (true) {
            int numTable = i * firstNum;

            if (numTable % secondNum == 0) {
                lcm = numTable;
                break;
            }

            i++;
        }

        System.out.println("LCM of Number " + firstNum + " and " + secondNum + " is: " + lcm);

    }
}
