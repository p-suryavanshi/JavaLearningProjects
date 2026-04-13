package Arrays.ThreeDimensionalArrays;
import java.util.Scanner;

public class TotalSumAndMaxSumFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Data Analyzer ===\n");

        int [][][]appt = new int[2][3][3];

        System.out.println("\n=== Please Enter the Values in the Buildings ===\n");

        for (int i = 0; i < appt.length; i++) {
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print("Building: " + (i + 1) + " Flor: " + (j + 1) + " Flat: " + (k + 1) + " Value: ");
                    appt[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        int maxSum = 0;

        for (int i = 0; i < appt.length; i++) {
            System.out.println("Building " + (i + 1) + ": " );
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print(appt[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int winnerBuilding = 0;

        for (int i = 0; i < appt.length; i++) {
            int buildingSum = 0;
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    buildingSum += appt[i][j][k];
                }
            }
            System.out.println("Building " + (i + 1) + ": " + buildingSum);

            if (buildingSum > maxSum) {
                maxSum = buildingSum;
                winnerBuilding = i + 1;
            }

            System.out.println();
        }

        System.out.println("Winner: Building " + winnerBuilding + " is the heaviest with " + maxSum + " total values!");

    }

}