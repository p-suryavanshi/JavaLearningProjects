package Arrays.OneDimensionalArrays;
import java.util.Scanner;

public class EvenOddSeperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Even Odd Seperator ***\n");

        int []nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Please enter a number: ");
            nums[i] = sc.nextInt();
        }

        for (int j = 0; j < nums.length-1; j++) {
            if (nums[j] % 2 == 0) {
                System.out.print("\nEven Number: " + nums[j]);
            }
        }

        for (int k = 0; k < nums.length-1; k++) {
            if (nums[k] % 2 != 0) {
                System.out.print("\nOdd Numbers: " + nums[k]);
            }
        }

    }

}

