package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class PowerHouse {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Power House ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        System.out.print("Now, enter the Power of the Number: ");
        int power = sc.nextInt();

        int numPower = 1;

        for ( int i = 1; i <= power ; i++ ) {
            numPower = numPower * num;
        }

        System.out.println(numPower);

    }

}
