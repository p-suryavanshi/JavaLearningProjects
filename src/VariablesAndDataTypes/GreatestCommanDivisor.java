package VariablesAndDataTypes;
import java.util.*;

public class GreatestCommanDivisor {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Greatest Comman Divisor Finder ---\n");

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Now, enter the second number: ");
        int num2 = input.nextInt();

        int result = greatestCommanDivisor(num1,num2);

        System.out.println("The Greatest Comman Divisor is: " + result );

    }

    public static int greatestCommanDivisor(int num1, int num2){

        int gcd = 1;
        int i = 2;
        int least = least(num1,num2);

        while ( i <= least ){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i ;
            }
            i++;
        }

        return gcd;

    }

    public static int least(int num1,int num2){

        if ( num1 < num2 ){
            return num1;
        } else  {
            return num2;
        }

    }

}
