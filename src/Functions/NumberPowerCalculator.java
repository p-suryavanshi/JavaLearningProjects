package Functions;
import java.util.Scanner;

public class NumberPowerCalculator {

    public static void SquareAndCube(int num) {

        int square = num * num;
        int cube = num * num * num;

        System.out.println("\n=== Square & Cube of Number " + num +  " ===");
        System.out.println("\nSquare of Number " + num + " is: " + square );
        System.out.println("Cube of Number " + num + " is: " + cube);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Number Power Calculator ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        SquareAndCube(num);

    }

}