package Arrays;
import java.util.Scanner;

public class ArrayReverser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Array Reverser ***\n");

        int[] nums = new int[5];

        int i = 0;
        while (i < nums.length) {
            System.out.print("Please enter a Number: ");
            nums[i] = sc.nextInt();
            i++;
        }

        for (int j = 4; j >= 0; j--) {
            System.out.println(nums[j]);
        }

    }

}