package Functions.Recursion;
import java.util.Scanner;

public class ArraySum {

    public static int Sum(int [] arr, int n) {

        if (n < 0) {
            return 0;
        }

        return arr[n] + Sum(arr,n-1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Sum of Arrays Element Calculator ===\n");

        int nums[] = new int[4];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Please enter Number: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\nTotal sum of array is: " + Sum(nums, nums.length-1));

    }

}
