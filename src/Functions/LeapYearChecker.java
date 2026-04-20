package Functions;
import java.util.Scanner;

public class LeapYearChecker {

    public static String LeapYear(int year) {

        boolean isLeap = false;

        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        
        if (isLeap) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Leap Year Checker ===\n");

        System.out.print("Please enter the Year: ");
        int year = sc.nextInt();

        System.out.println("\nYear " + year + " is " + LeapYear(year));

    }

}