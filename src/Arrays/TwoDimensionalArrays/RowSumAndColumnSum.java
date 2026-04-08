package Arrays.TwoDimensionalArrays;
import java.util.Scanner;
import java.util.Arrays;

public class RowSumAndColumnSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Sum Calculator Of Rows & Columns ===\n");

        int [][]nums = new int[3][3];

        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                System.out.print("Please enter Number: ");
                nums[row][column] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Total Sum of Row ===\n");

        for (int k = 0; k < nums.length; k++) {
            int rowSum = 0;
            for (int l = 0; l < nums[k].length; l++) {
                rowSum += nums[k][l];
            }
            System.out.println("Sum of Row " + (k + 1) + ": " + rowSum);
        }

        System.out.println("\n=== Total Sum of Columnn ===\n");

        for (int m =  0; m < nums.length; m++ ) {
            int columnSum = 0;
            for (int n = 0; n < nums[m].length; n++) {
                columnSum += nums[n][m];
            }
            System.out.println("Sum of Column " + (m + 1) + ": " + columnSum );
        }

    }

}