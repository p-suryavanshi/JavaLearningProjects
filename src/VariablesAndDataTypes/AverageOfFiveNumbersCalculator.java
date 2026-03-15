package Basic;
import java.util.*;

public class AverageOfFiveNumbersCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Average of Five Numbers Calculator ***\n");

        System.out.print("Please enter First Number to Calculate Average: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter Second Number to Calculate Average: ");
        int num2 = input.nextInt();
        System.out.print("Now, enter Third Number to Calculate Average: ");
        int num3 = input.nextInt();
        System.out.print("Now, enter Fourth Number to Calculate Average: ");
        int num4 = input.nextInt();
        System.out.print("Now, enter Fifth Number to Calculate Average: ");
        int num5 = input.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;

        int average = sum / 5;

        System.out.println("The Average of your Given Five Numbers is: " + average);

    }

}
