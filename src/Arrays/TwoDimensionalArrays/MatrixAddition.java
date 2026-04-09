package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Matrix Addition Calculator ***\n");

        int [][]matrixOne = new int[3][3];
        int [][]matrixTwo = new int[3][3];

        System.out.println("=== Please Fill the First Matrix ===\n");

        for (int i = 0; i < matrixOne.length; i++ ) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrixOne[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n=== Now, Fill the Second Matrix ===\n");

        for (int k = 0; k < matrixTwo.length; k++) {
            for (int l = 0; l < matrixTwo.length; l++) {
                System.out.print("Please enter Number: ");
                matrixTwo[k][l] = sc.nextInt();
            }
            System.out.println();
        }

        int [][]matrixThree = new int[3][3];

        for (int m = 0; m < matrixOne.length; m++ ) {
            for (int n = 0; n < matrixTwo.length; n++ ) {
                matrixThree[m][n] = matrixOne[m][n] + matrixTwo[m][n];
                System.out.print(matrixThree[m][n] + " ");
            }
            System.out.println();
        }

    }

}