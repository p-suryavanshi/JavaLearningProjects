package Functions;
import java.util.Scanner;

public class PersonalBio {

    public static void Bio(String name, String city, String college) {
        System.out.println("\n=== PERSONAL BIO REPORT ===");
        System.out.println("\nHello! my name is "  + name );
        System.out.println("I am from " + city );
        System.out.println("I have done my graduation from " + college);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Personal Bio Generator ===\n");

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Now, enter your city name: ");
        String city = sc.nextLine();
        System.out.print("Now, enter your college name: ");
        String college = sc.nextLine();

        Bio(name,city,college);

    }

}