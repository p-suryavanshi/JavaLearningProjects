package Strings;
import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the String Comparison ===\n");

        String s1 = "Java";
        String s2 = "Java";

        System.out.print("Type Java: ");
        String s3 = sc.nextLine();

        System.out.println("Using s1 == s2: " + (s1 == s2) );
        System.out.println("Using s1 == s3: " + (s1 == s3) );
        System.out.println("Using s1.equals(s3): " + s1.equals(s3));

    }

}