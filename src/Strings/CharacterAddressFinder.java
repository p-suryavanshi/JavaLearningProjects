package Strings;
import java.util.Scanner;

public class CharacterAddressFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Character Address Finder ===\n");

        System.out.print("Please enter your Email Id: ");
        String email = sc.nextLine();

        System.out.print("Which character address you want to find please enter: ");
        char ch = sc.next().charAt(0);

        System.out.println("\nCharacter " + ch  + " is at: " + email.indexOf(ch));
        if (email.indexOf(ch) == -1 ) {
            System.out.println("Character " + ch + " is in not in the Email ID.");
        }

    }

}