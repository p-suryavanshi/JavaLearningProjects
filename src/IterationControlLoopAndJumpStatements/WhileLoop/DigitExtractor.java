package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class DigitExtractor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Digit Extractor ***\n");

        System.out.print("Please enter the Number: ");
        int num = sc.nextInt();

        int i = num;
        int count = 0;

        while (i > 0) {
            i /= 10;
            count++;
        }

        System.out.println("Number " + num + " have " + count + " Digits.");

    }

}
