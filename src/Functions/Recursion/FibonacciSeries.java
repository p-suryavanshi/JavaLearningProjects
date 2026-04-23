package Functions.Recursion;
import java.util.Scanner;

public class FibonacciSeries {

    public static int Fibonacci(int n) {

        if (n <= 1) {
            return n ;
        }

        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Fibonacci Series ===\n");

        System.out.print("Please enter a number till you want: ");
        int num = sc.nextInt();

        System.out.println("\n=== FIBONACCI SERIES ===");

        for (int i = 0; i <= num; i++) {
            System.out.println(Fibonacci(i) + " ");
        }

    }

}