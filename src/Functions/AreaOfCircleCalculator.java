package Functions;
import java.util.Scanner;

public class AreaOfCircleCalculator {

    public static double AreaOfCircle(double r) {
        return 3.14159265359 * (r * r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Area of Circle Calculator ===\n");

        System.out.print("Please enter the Radius of Circle: ");
        double radius = sc.nextDouble();

        double result = AreaOfCircle(radius);

        System.out.println("Area of Circle is: " + result);

    }

}