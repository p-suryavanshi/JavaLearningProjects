package Strings;
import java.util.Scanner;

public class SpaceCleaner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to The Space Cleaner ===\n");

        System.out.print("Please enter your City name: ");
        String city = sc.nextLine();

        System.out.println(city.trim());
        System.out.println(city.isBlank());
        System.out.println(city.isEmpty());

    }

}