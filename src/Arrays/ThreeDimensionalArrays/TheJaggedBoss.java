package Arrays.ThreeDimensionalArrays;
import java.util.Scanner;

public class TheJaggedBoss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int appt[][][] = new int[2][][];

        appt[0] = new int[2][2];
        appt[1] = new int[4][2];

        System.out.println("=== Please Fill the Array ===\n");

        for (int i = 0; i < appt.length; i++) {
            System.out.println("Building: " + (i + 1) );
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print("Please enter Number: ");
                    appt[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int i = 0; i < appt.length; i++) {
            System.out.println("Building: " + (i + 1) );
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print(appt[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}