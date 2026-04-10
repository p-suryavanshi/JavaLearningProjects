package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome  to the Transpose of Matrix ===\n");

        int [][]matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int [][]transpose = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }

}