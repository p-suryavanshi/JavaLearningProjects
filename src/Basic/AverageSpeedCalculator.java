package Basic;
import java.util.*;

public class AverageSpeedCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Average Speed Calculator ***\n");

        System.out.print("Please enter the Distance in Kilometer(KM): ");
        double distance = input.nextDouble();;

        System.out.print("Now, enter the Time in Hours: ");
        double time = input.nextDouble();

        double averageSpeed = distance / time;

        System.out.println("The Average Speed is: " + averageSpeed + "Kmph");
    }

}
