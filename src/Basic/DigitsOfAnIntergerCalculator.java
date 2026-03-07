package Basic;

import java.util.*;

public class DigitsOfAnIntergerCalculator {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("\n*** Welcome to the Digits of an Interger Calculator ***\n");

        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int sum = sumOfDigits(num);

        System.out.println("The Sum of the number is: " + sum);

    }

    public static int sumOfDigits(int num ){

        int sum = 0;

        while ( num > 0 ){
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;

    }

}