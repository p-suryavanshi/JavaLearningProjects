package Arrays.TwoDimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixToOneDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][]matrix = new int[3][3];
        int k = 0;

        System.out.println("\n=== Please Fill the Matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int []oneDArray = new int[9];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                oneDArray[k] = matrix[i][j];
                k++;
            }
        }

        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println(oneDArray[i]);
        }

    }

}