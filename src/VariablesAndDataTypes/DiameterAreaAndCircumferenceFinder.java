package Basic;
import java.util.*;

public class DiameterAreaAndCircumferenceFinder {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Diameter, Area and Circumference Finder ***\n");

        System.out.print("Please enter the Radius: ");
        double radius = input.nextDouble();

        double diameter = radius + radius;
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14159265359 * radius;

        System.out.println("Diameter is: " + diameter);
        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circumference);

    }

}
