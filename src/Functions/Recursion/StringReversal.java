package Functions.Recursion;
import java.util.Scanner;

public class StringReversal    {

    public static String Reverse(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return Reverse(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the String Reversal ===\n");

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("String " + name + " is reversed: " + Reverse(name));

    }

}