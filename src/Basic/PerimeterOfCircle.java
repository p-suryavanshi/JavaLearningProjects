package Basic;
import java.util.*;

public class PerimeterOfCircle {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Perimeter of Circle Calculator ===\n");

        System.out.print("Please enter the radius (length of circle to center) of circle: ");
        float radius  = input.nextFloat();

        double  perimeter = 2 * 3.142857142857  * radius;

        System.out.println("\nThe Perimeter of the Circle is: " + perimeter);

    }

}
