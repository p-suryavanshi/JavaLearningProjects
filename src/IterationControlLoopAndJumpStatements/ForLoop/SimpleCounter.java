package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class SimpleCounter {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Simple Counter ***\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }

}
