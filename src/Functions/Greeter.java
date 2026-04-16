package Functions;
import java.util.Scanner;

public class Greeter {

    public static String Greet(String name, String age ) {

        return "\nYour Name is: " + name + "\nyour Age is: " + age;

    }

    public static void main(String[] args) {

        System.out.println("\n=== Welcome to the Greeter ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Now enter your Age: ");
        String age = sc.nextLine();

        System.out.println(Greet(name,age));

    }

}