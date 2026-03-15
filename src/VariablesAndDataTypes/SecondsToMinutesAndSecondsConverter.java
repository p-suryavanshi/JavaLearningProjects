package VariablesAndDataTypes;
import java.util.*;

public class SecondsToMinutesAndSecondsConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Seconds to Minutes and Seconds Converter ---\n");

        System.out.print("Please enter the Seconds to convert into Minutes & Seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int reminder = seconds % 60;
        int finalSeconds = reminder / 1;

        System.out.println("Your given seconds " + seconds + " is converted into Minutes & Seconds: " + minutes + "M " + finalSeconds + "S");

    }

}
