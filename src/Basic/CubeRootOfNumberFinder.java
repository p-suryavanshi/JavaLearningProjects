package Basic;
import java.util.*;

public class CubeRootOfNumberFinder {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n---Welcome to the Cube Root of a Number Finder");

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int cubeRoot = num * num * num;

        System.out.println("The Cube Root of your Number " + num + " is: " + cubeRoot);

    }

}
