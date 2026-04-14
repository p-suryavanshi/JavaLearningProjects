package Strings;
import java.util.Scanner;

public class BioDataGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to The Bio-Data Generator ===\n");

        System.out.print("Please enter your City Name: ");
        String city = sc.nextLine();

        System.out.print("Now, enter your State Name: ");
        String state = sc.nextLine();

        String bioData = city + state;

        System.out.println("\n=== Bio-Data ===");
        System.out.println("City: " + city + ", State: " + state);

        System.out.println("\nTotal Length of City & State: " + bioData.length());

        switch (city.charAt(0)) {
            case 'U' , 'u' ->
                System.out.println("\nCity name " + city + " Starts with U");
            default ->
                System.out.println("\nCity name " + city + " do not starts with U");
        }

    }

}