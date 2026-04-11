package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class RowWiseSorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Row Wise Sorting ===\n");

        int [][]matrix = new int[3][3];

        System.out.println("=== Please Fill the matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                System.out.print("Please enter Number :");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[j].length-1; k++) {
                    if ( matrix[i][k] > matrix[i][k+1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k+1];
                        matrix[i][k+1] = temp;
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}