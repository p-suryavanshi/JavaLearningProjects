package Functions;
import java.util.Scanner;

public class GreatestNumberFinder {

    public static int GrestestNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

    public static void Label(int res, int n1, int n2, int n3) {

        if (res == n1) {
            System.out.println("\nFirst Number " + n1 + " is Greatest.");
        } else if (res == n2) {
            System.out.println("\nSecond Number " + n2 + " is Greatest.");
        } else {
            System.out.println("\nThird Number " + n3 + " is Greatest.");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Greatest Number Finder among three Numbers ===\n");

        System.out.print("Please enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Now, enter second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Now, enter third Number: ");
        int num3 = sc.nextInt();

        int result = GrestestNumber(num1,num2,num3);
        Label(result,num1,num2,num3);

    }

}