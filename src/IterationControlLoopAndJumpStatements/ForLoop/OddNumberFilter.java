package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class OddNumberFilter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Odd Number Filter ***\n");

        System.out.print("Please enter the Number Till you want Even: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) {
                continue;
            } else {
                System.out.println(i + " is Even.");
            }

        }

    }

}