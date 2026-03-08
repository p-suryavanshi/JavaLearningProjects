package Basic;
import java.util.*;

public class IntToDoubleConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Interger  to Double DataType Converter ---\n");

        System.out.print("Please enter an Interger Number: ");
        int num = input.nextInt();

        double intToDouble = num;

        System.out.println("Your Interger Number Type " + num + " is Converted into Double DataType: " + intToDouble );
    }

}
