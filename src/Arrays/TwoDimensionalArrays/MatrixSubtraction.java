package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class MatrixSubtraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Matrix Subtraction Calculator ===\n");

        int [][]matrixOne = new int[3][3];
        int [][]matrixTwo = new int[3][3];

        System.out.println("\nPlease Fill First Matrix\n");

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrixOne[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nNow, Fill Second Matrix\n");

        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrixTwo[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nResult of Matrix Subtraction\n");

        int [][]matrixThree = new int[3][3];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixThree[i][j] = matrixOne[i][j] - matrixTwo[i][j];
                System.out.print(matrixThree[i][j] + " ");
            }
            System.out.println();
        }

    }

}