package IterationControlLoopAndJumpStatements.WhileLoop;
import java.util.*;

public class BinaryToDecimalConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Binary to Decimal Converter ***\n");

        System.out.print("Please enter the Binary Number: ");
        int binaryNum = sc.nextInt();

        int i = binaryNum;
        int decimal = 0;
        int p = 0;

        while (i > 0) {
            int lastDigit = i % 10;
            decimal += lastDigit * Math.pow(2, p) ;
            p++;
            i /= 10;
        }

        System.out.println(decimal);

    }

}