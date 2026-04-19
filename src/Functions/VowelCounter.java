package Functions;
import java.util.Scanner;

public class VowelCounter {

    public static int Vowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            switch (str.charAt(i)) {

                case 'a','A','e','E','i','I','o','O','u','U' -> count ++;

            }

        }

        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Vowel Counter ===\n");

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nYour name " + name + " have " + Vowel(name) + " Vowel.");

    }

}