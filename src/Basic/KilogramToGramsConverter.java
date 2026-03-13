package Basic;
import java.util.*;

public class KilogramToGramsConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Kilogram to Grams Converter ---\n");

        System.out.print("Please enter the Kilogram you want to convert into grams: ");
        double kilogram = input.nextDouble();

        double grams = kilogram * 1000;

        System.out.println("Your Kilogram " + kilogram  + " is converted into Grams: " + grams + "G");

    }

}
