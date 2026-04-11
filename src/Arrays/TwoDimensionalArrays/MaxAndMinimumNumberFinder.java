package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class MaxAndMinimumNumberFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Max & Minimum Number Finder ===\n");

        int [][]matrix = new int[3][3];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int min = matrix[0][0];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                } else if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum Number in Matrix is: " + max);
        System.out.println("Minimum Number in Matrix is: " + min);

    }

}