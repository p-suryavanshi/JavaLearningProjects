package Basic;
import java.util.*;

public class AreaOfTriangleCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Area of Triangle Calculator ---\n");

        System.out.print("Please enter the Base of your Triangle: ");
        int base = input.nextInt();

        System.out.print("Now, enter the Length of your Triangle: ");
        int length = input.nextInt();

        int area = base * length / 2;

        System.out.println("The Area of your Triangle is: " + area);

    }

}
