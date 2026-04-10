package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class ScalarMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the Scalar Multiplication\n");

        int [][]matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("\nPlease enter the Number you want to Multiply: ");
        int multiplier = sc.nextInt();

        System.out.println("\n=== Scalar Multiplication ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int multiply = multiplier * matrix[i][j];
                System.out.print(multiply  + " ");
            }
            System.out.println();
        }

    }

}