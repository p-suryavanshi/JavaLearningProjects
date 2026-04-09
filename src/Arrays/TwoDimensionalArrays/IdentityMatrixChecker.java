package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class IdentityMatrixChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Identity Matrix Checker ===\n");

        int [][]nums = new int[3][3];

        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums.length; column++) {
                System.out.print("Please enter Number: ");
                nums[row][column] = sc.nextInt();
            }
            System.out.println();
        }

        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums[k].length; l++) {
                System.out.print(nums[k][l] + " ");
            }
            System.out.println();
        }

        boolean isIdentity = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    if (nums[i][j] != 1) {
                        isIdentity = false;
                    }
                    break;
                } else if (i + j == 2) {
                    if (nums[i][j] != 1) {
                        isIdentity = false;
                    }
                    break;
                } else {
                    if (nums[i][j] != 0) {
                        isIdentity = false;
                    }
                    break;
                }
            }
            if (!isIdentity) break;
        }

        if (isIdentity) {
            System.out.println("\nMatrix is Identity Matrix");
        } else {
            System.out.println("\nMatrix is Not Identity matrix");
        }

    }

}