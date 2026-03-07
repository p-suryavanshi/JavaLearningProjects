package Basic;
import java.util.*;

public class PerimeterOfRectangle {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Perimeter of Rectangle Calculator ---\n");

        System.out.print("Please enter the length of the rectangle: ");
        float length = input.nextFloat();

        System.out.print("Now, enter the width of the rectangle: ");
        float width = input.nextFloat();

        double perimeter  = 2 * ( length + width ) ;

        System.out.println("The Perimeter of Rectangle is: " + perimeter);

    }

}
