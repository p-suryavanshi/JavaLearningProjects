package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class DigonalSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Digonal Sum ===\n");

        int [][]nums = new int[3][3];

        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                System.out.print("Please enter Number: ");
                nums[row][column] = sc.nextInt();
            }
            System.out.println();
        }

        int digonalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) {
                    digonalSum += nums[i][j];
                    System.out.print(nums[i][j]);
                } else if (i + j == 2) {
                    digonalSum += nums[i][j];
                    System.out.print(nums[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\nDigonal Sum: " + digonalSum);

    }

}