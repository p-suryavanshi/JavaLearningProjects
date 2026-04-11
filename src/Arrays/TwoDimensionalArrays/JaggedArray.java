package Arrays.TwoDimensionalArrays;
import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Jagged Array ===\n");

        int [][]arr = new int[3][];

        System.out.print("Please enter the Size of Row 1: ");
        arr[0] = new int[sc.nextInt()];
        System.out.print("Now, enter the Size of Row 2: ");
        arr[1] = new int[sc.nextInt()];
        System.out.print("Now, enter the Size of Row 3: ");
        arr[2] = new int[sc.nextInt()];

        System.out.println("\n=== Please Fill the Array ===\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Please enter Number: ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n=== Array ===\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}