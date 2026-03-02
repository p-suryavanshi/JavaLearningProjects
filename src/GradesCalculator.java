import java.util.*;

public class GradesCalculator {

    //Creating a fumction that takes interger input from user
    public static int numbers(){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        return number;
    }

    //Creating additon method that add numbers function and return addition
    public static int addition(){

        int addition = numbers() + numbers();

        System.out.println("The result of your given numbers is: " + addition );

        return addition;
    }

    //Main method
    static void main(String[] args) {

        //Greeting message for the user
        System.out.println("\n--- Welcome to the Grades Calculator ---\n");

        //Calling addition() methos
        addition();

    }

}
