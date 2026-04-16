package Functions;
import java.util.Scanner;

public class SimpleCalculator {

    public static void Math(int num1, int num2) {
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("\nAddition of Number " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Subtraction of Number " + num1 + " and " + num2 + " is: " + sub);
        System.out.println("Multiplication of Number " + num1 + " and " + num2 + " is: " + mult);

        if (num2 != 0) {
            System.out.println("Division of Number " + num1 + " and " + num2 + " is: " + div);
        } else {
            System.out.println("Number " + num2 + " is Not Divisible by Zero.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Simple Calculator ===\n");

        System.out.print("Please enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Now, enter Second Number: ");
        int num2 = sc.nextInt();

        Math(num1,num2);

    }

}