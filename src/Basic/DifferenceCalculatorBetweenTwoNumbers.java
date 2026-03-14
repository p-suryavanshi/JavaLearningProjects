package Basic;
import java.util.*;

public class DifferenceCalculatorBetweenTwoNumbers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Difference Calculator ***\n");

        System.out.print("Please enter the First Number: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int num2 = input.nextInt();

        int difference = num1 - num2;

        System.out.println("The difference between First Number " + num1 + " and Second Number " + num2 + " is: " + difference);
    }

}
