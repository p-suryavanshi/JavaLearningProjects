package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SuperstitiousCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Superstitious Counter ***\n");

        System.out.print("Please enter the Number till you want to count: ");
        int num = sc.nextInt();
        System.out.print("Now, enter the Two Number you want to Skip: ");
        int skipnum1 = sc.nextInt();
        int skipnum2 = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if (i == skipnum1 || i == skipnum2) {
                System.out.println("Number " + i + " is Skipped.");
                continue;
            } else {
                System.out.println(i);
            }

        }

    }

}