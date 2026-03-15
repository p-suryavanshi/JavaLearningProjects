package Basic;
import java.util.*;

public class MililiterToLiterConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Mililiter to Liter Converter ***\n");

        System.out.print("Please enter the Mililiter: ");
        double mililiter = input.nextDouble();

        double liter = mililiter / 1000;

        System.out.println("Mililiter " + mililiter + "ML is converted into Liter: " + liter + "L");
    }

}
