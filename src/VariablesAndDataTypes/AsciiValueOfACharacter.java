package Basic;
import java.util.*;

public class AsciiValueOfACharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the ASCII Value Printer of a Character ---\n");

        System.out.print("Please enter a character: ");
        char ch = input.next().charAt(0);

        int asciiValue = ch ;

        System.out.println("The ASCII Value of Character " + "'" + ch + "'" + " is: " + asciiValue);

    }

}
