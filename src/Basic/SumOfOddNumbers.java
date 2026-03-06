package Basic;

import java.util.*;

public class SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Odd Numbers Calculator ---\n");

        System.out.print("Please enter a number till you want to perform the addition of odd numbers: ");
        int num = input.nextInt();

        int result = oddSum(num);
        System.out.println("\nSum of Odd number till " + num + " is: " + result);

    }

    public static int oddSum(int num){

        int oddNumber = 1;
        int sum = 0;

        while ( oddNumber <= num ){

            if ( oddNumber % 2 != 0 ){
                sum = sum + oddNumber;
            }
            oddNumber++;
        }

        return sum;

    }
}