package Arrays;
import java.util.Scanner;

public class ArraySwapper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Array Swapper ***\n");

        int []num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Please enter Number: ");
            num[i] = sc.nextInt();
        }

        int temp = 0;
            temp = num[0];
            num[0] = num[2];
            num[2] = temp;

        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
        }

    }

}