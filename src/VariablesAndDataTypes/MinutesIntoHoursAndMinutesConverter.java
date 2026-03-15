package VariablesAndDataTypes;
import java.util.*;

public class MinutesIntoHoursAndMinutesConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Minutes into hourse and Minutes Converter ---\n");

        System.out.print("Please enter the Minutes: ");
        int minut = input.nextInt();

        float hoursAndMinutes = minut / 60F;

        System.out.println("Minutes is converted into Hours & Minutes: " + hoursAndMinutes + "Hours");

    }

}
