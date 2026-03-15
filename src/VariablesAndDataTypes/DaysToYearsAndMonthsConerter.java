package VariablesAndDataTypes;
import java.util.*;

public class DaysToYearsAndMonthsConerter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Days Into Years And Months Calculator ***\n");

        System.out.print("Please enter the days you want to converte into Years & Months: ");
        int days = input.nextInt();

        int year = days / 365;
        int reminder = days % 365;
        int month = reminder / 30;
        int finalDays = reminder % 30;

        System.out.println("Your days " + days + " is Converted into: " + year + "Year " + month + "Months " + finalDays + "Days");

    }

}
