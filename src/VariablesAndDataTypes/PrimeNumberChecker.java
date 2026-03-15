package Basic;
import java.util.*;

public class PrimeNumberChecker {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Prime Number Checker ---\n");

        System.out.print("Please enter a number to check Prime Number: ");
        int num = input.nextInt();

        int i = 2;

        while (i < num){
            if (num % i == 0 ){
                System.out.println("Is a Prime Number.");
            }
            i++;
        }

        System.out.println("Your number is not a  Prime Number");

    }

}
