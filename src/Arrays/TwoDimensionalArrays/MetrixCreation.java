package Arrays.TwoDimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;

public class MetrixCreation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Metrix Builder ===\n");

        int [][]metrix = new int[3][3];

        for (int row = 0; row < metrix.length; row++) {
            for (int colums = 0; colums < metrix.length; colums++) {
                System.out.print("Please enter Number: ");
                metrix[row][colums] = sc.nextInt();
            }
        }

        System.out.println("\n=== 3X3 Metrix ===\n");

        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix.length; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}