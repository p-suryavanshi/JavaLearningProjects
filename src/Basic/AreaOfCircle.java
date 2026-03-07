package Basic;
import java.util.*;

public class AreaOfCircle {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Area of Circle Calculator ---\n");

        System.out.print("Please enter the radius (length of circle to center) of your circle: ");
        float radius = input.nextFloat();

        double circle  = 3.14159265359 * radius * radius;

        System.out.println("The area of circle is: "  + circle);

    }

}
