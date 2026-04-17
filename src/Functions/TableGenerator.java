package Functions;
import java.util.Scanner;

public class TableGenerator {

    public static void Table(int num) {


        for (int i = 1; i <= 10; i++) {
            int mult = num * i;
            System.out.println(num + " X " + i + " = " + mult );
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Table Generator ===\n");

        System.out.print("Please enter a Number: ");
        int num = sc.nextInt();

        Table(num);

    }

}