package VariablesAndDataTypes;
import java.util.*;

public class PercentageCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Percentage Calculator ***\n");

        System.out.print("Please enter the Total Marks: ");
        double totalMarks = input.nextDouble();

        System.out.print("Now, enter the Marks you have Obtained: ");
        double obtainMarks = input.nextDouble();

        double percentage = (totalMarks / obtainMarks) * 100;

        System.out.println("Your Percentage is: " + percentage);

    }

}
