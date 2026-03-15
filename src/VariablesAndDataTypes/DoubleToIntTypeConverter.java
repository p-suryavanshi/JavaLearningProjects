package Basic;
import java.util.*;

public class DoubleToIntTypeConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Double to Int DataType Converter ---\n");

        System.out.print("Please enter a Double Type Number (Decimal Number): ");
        double num  = input.nextDouble();

        int doubleToInt = (int)num;

        System.out.println("Your Entered Double Type Number (Decimal Number) " + num + " is converted into Interger Number: " + doubleToInt );

    }

}
