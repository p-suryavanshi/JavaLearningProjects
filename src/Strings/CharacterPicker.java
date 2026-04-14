package Strings;
import java.util.Scanner;

public class CharacterPicker      {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Character Picker ===\n");

        System.out.print("What is your favorite food ? Please Enter: ");
        String favFood = sc.nextLine();

        System.out.println("\nFirst letter: " + favFood.charAt(0));

        System.out.println("\nMid letter: " + favFood.charAt(favFood.length() / 2));

        System.out.println("\nLast letter: " + favFood.charAt(favFood.length() - 1));

    }

}