package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Symmetric Matrix ===\n");

        int [][]matrix = new int[3][3];

        System.out.println("=== Please Fill the Matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("=== Matrix ===\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Transpose of Matrix ===\n");

        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                }
            }
            System.out.println();
        }

        System.out.println();

        if (!isSymmetric) {
            System.out.println("Matrix is Not Symmetric Matrix.");
        } else {
            System.out.println("Matrix is Symmetric Matrix.");
        }

    }

}