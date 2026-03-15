package Basic;

import java.util.*;

public class FactorialCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to Factorial Calculator ***\n");

        System.out.print("Please enter a factorial number that you want to calculate: ");
        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("The Factorial of " + num + " is: " + fact);

    }

    public static long factorial(int num){

        int n = 1;
        long fact = 1;
        while ( n <= num ){
            fact *= n;
            n++;
        }

        return fact;
    }

}
