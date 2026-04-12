package Arrays.ThreeDimensionalArrays;
import java.util.Scanner;

public class LocationFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Location Finder ***\n");

        int [][][]appt = new int[2][2][2];

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

        System.out.print("Please enter the Value: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < appt.length; i++) {
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    if (num == appt[i][j][k]) {
                        System.out.println("\nValue is at Buliding " + i + " Flor " + j + " Flat " + k);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("\nVlaue is not in any Building.");
        }

    }

}