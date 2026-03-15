package VariablesAndDataTypes;
import java.util.*;

public class DaysPrinterUsingSwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Days Printer ---\n");

        System.out.print("Please enter a number between 1 to 7 to check Day: ");
        int num = input.nextInt();

        switch (num){
            case 1 :
                System.out.println("\nMonday");
                break;
            case 2 :
                System.out.println("\nTuesday");
                break;
            case 3 :
                System.out.println("\nWednesday");
                break;
            case 4 :
                System.out.println("\nThursday");
                break;
            case 5 :
                System.out.println("\nFriday");
                break;
            case 6 :
                System.out.println("\nSaturday");
                break;
            case 7 :
                System.out.println("\nSunday");
                break;
            default :
                System.out.println("\n--You have entered  Invalid number --");
        }

    }
}
