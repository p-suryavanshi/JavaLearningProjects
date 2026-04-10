package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class ElementSearcher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Element Searcher ===\n");

        int [][]matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Please enter Number: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("\nWhich Number you want to search: ");
        int num = sc.nextInt();

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (num == matrix[i][j]) {
                    System.out.println("Number " + num +  " is at row " + i + " and column " + j );
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Number " + num + " is Not in the Matrix");
        }

    }

}