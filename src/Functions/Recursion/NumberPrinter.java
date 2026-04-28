package Functions.Recursion;
import java.util.Scanner;

public class NumberPrinter {

    public static void Num(int n) {

        if (n == 0 ) return;

        Num(n-1);

        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter a Number: ");
        int num = sc.nextInt();

        Num(num);

    }

}