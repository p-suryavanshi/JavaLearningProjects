package OperatorsAndDecisionLogic.ShapeAreaCalculator;
import java.util.*;

public class ShapeAreaCalculator {

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Shape Area Calculator ***\n");

        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Rectangle");
        System.out.println("Enter 3 for Square\n");
        System.out.print("Enter (1,2,3): ");
        int option = sc.nextInt();

        switch (option) {

            case 1 :
                System.out.print("Please enter the Radius of Circle: ");
                double radius = sc.nextDouble();

                double areaOfCircle = 3.14159265359 * radius * radius;

                System.out.println("Area of Circle is: " + areaOfCircle );
                break;
            case 2 :
                System.out.print("Please enter the Length of Rectange: ");
                double length = sc.nextDouble();
                System.out.print("Now, enter the Breadth of Rectangele: ");
                double breadth  = sc.nextDouble();

                double areaOfRectangle = length * breadth;

                System.out.println("Area of Rectangle is: " + areaOfRectangle);
                break;
            case 3 :
                System.out.print("Please enter the Side Length of Square");
                double sideLength = sc.nextDouble();

                double areaOfSquare = sideLength * sideLength;

                System.out.println("Area of Square is: " + areaOfSquare);
                break;
            default :
                System.out.println("You have entered Invalid Option Please Try Again!");
        }

    }

}
