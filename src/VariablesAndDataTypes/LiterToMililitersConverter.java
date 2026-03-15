package VariablesAndDataTypes;
import java.util.*;

public class LiterToMililitersConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to the Liter to Militer Converter ***\n");

        System.out.print("Please enter the Liter: ");
        double liter = input.nextDouble();

        double mililiter = liter * 1000;

        System.out.println("Liter " + liter + "L is converted into Mililiter " + mililiter + "ML");

    }

}
