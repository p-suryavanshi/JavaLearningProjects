package Arrays.TwoDimensionalArrays;
import IterationControlLoopAndJumpStatements.ForLoop.ReverseCountdown;

import javax.swing.event.RowSorterEvent;
import java.util.Scanner;

public class NinetyDegreeRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the 90 Degree Matrix Rotator ===\n");

        int [][]matrix = new int[3][3];

        System.out.println("=== Please Fill the Matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n=== Matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Transpose ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Reverse Each Row ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 3-1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}