package Basic;
import java.io.StringReader;
import java.util.*;

public class CubeOfNumber {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Cube of a Number Finder ---\n");

        System.out.print("Please enter a Number: ");
        long num = input.nextInt();

        long cube = num * num *  num;

        System.out.println("The Cube of your given number is: " + cube);

    }

}
