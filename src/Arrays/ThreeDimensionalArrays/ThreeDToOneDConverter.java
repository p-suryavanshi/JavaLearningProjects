package Arrays.ThreeDimensionalArrays;
import java.util.Scanner;

public class ThreeDToOneDConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the 3D to 1D Converter ===\n");

        int [][][]appt = new int[2][3][3];
        int count = 0;

        System.out.println("=== Please Fill the Value in the Building ===\n");

        for (int i = 0; i < appt.length; i++) {
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    System.out.print("Please Enter Value: ");
                    appt[i][j][k] = sc.nextInt();
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }

        int []oneDArray = new int[count];
        int p = 0;

        for (int i = 0; i < appt.length; i++ ) {
            for (int j = 0; j < appt[i].length; j++) {
                for (int k = 0; k < appt[i][j].length; k++) {
                    oneDArray[p] = appt[i][j][k];
                    p++;
                }
            }
        }

        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println(oneDArray[i]);
        }

    }

}