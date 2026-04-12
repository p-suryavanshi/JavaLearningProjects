package Arrays.ThreeDimensionalArrays;
import java.util.Scanner;

public class TheBasicApartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][][]appt = new int[3][3][3];

        System.out.println("\n=== Please Fill the Apaerment ===\n");

        for (int i = 0; i < appt.length; i++) {
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print("Buliding: " + (i + 1) + " Flor: " + (j + 1) + " Flat: " + (k + 1) + " Value: ");
                    appt[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < appt.length; i++) {
            System.out.println("\nBuliding: ");
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print(appt[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }

}