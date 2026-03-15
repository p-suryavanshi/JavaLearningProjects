package Basic;
import java.util.*;

public class ProductCalculatorOfThreeNumbers {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Product Finder of Three Numbers ***\n");

        System.out.print("Please enter the First Number: ");
        int num1 = input.nextInt();

        System.out.print("Now,enter the Second Number: ");
        int num2 = input.nextInt();

        System.out.print("Now, enter the Third Number: ");
        int num3 = input.nextInt();

        int product = num1 * num2 * num3;

        System.out.println("The Product of Your First Number " + num1 + " Second Number " + num2 + " and Third Number " + num3 + " is: " + product);

    }

}
