package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class GrandTotalAndGrandAverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Grand Total & Grand Average Calculator of An 3X3 Matix Array ===\n");

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

        int totalSum = 0;

        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums[k].length; l++) {
                totalSum += nums[k][l];
            }
        }

        int average = 0;
        int count = 0;
        for (int m = 0; m < nums.length; m++) {
            for (int n = 0; n < nums[m].length; n++) {
                count++;
            }
        }

        System.out.println("\n=== Total Sum ===");
        System.out.println("Total Sum: " + totalSum);

        System.out.println("\n=== Average ===");
        average = totalSum / count;
        System.out.println("Average: " + average);
    }

}