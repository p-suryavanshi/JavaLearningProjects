package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Matrix Multiplicator ===\n");

        int [][]matrixOne = new int[3][3];
        int [][]matrixTwo = new int[3][3];

        System.out.println("\nPlease Fill the First Matrix\n");

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrixOne[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nNow, Fill the Second Matrix\n");

        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrixTwo[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n=== Result of Matrix Multiplication ===\n");

        int [][]matrixThree = new int[3][3];

        for (int i = 0; i < matrixThree.length; i++) {
            for (int j = 0; j < matrixThree[i].length; j++) {
                matrixThree[i][j] = 0;
                for (int k =0; k < matrixThree[j].length; k++) {
                    matrixThree[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }

    }

}