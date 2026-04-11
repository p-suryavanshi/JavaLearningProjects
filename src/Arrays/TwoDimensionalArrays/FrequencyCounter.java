package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Frequency Counter ===\n");

        int [][]matrix = new int[3][3];

        System.out.println("Please Fill the Matrix: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please Enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("Please enter the Number you want to check: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (num == matrix[i][j]) {
                    count++;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++ ) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nNumber " + num + " is " + count + " times in the Matrix.");

    }

}