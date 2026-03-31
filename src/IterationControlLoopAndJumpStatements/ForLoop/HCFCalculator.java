package IterationControlLoopAndJumpStatements.ForLoop;
import java.util.*;

public class HCFCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the HCF Calculator ***\n");

        System.out.print("Please enter the First Number: ");
        int firstNum = sc.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = sc.nextInt();

        int hcf = 0;

        for ( int i = 1; i <= firstNum && i <= secondNum ; i++ ) {
           if ( firstNum % i == 0 && secondNum % i == 0 ) {
               hcf = i;
           }
        }

        System.out.println("HCF" + " of " + firstNum + " and " + secondNum + " is: " + hcf);

    }

}
