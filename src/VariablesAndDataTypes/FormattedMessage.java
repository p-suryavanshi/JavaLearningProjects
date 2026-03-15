package Basic;
import java.util.*;

public class FormattedMessage {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Formatted Message Printer by Giving Your Details ---\n");

        System.out.print("Please enter your Name: ");
        String name = input.nextLine();

        System.out.print("Now, enter your Age; ");
        int age = input.nextInt();

        System.out.println("\nYour Name is: " + name + "\nYour Age is: " + age);

    }

}
