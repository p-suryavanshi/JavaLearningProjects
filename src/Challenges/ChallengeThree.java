package Challenges;
import java.util.*;

public class ChallengeThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter Number between 1 to 7 to  Print Day: ");
        int num = input.nextInt();

        String day = "";

        switch ( num ) {

            case 1 : day = "Monday"; break;
            case 2 : day = "Tuesday"; break;
            case 3 : day = "wednesday"; break;
            case 4 : day = "Thursday"; break;
            case 5 : day = "Friday"; break;
            case 6 : day = "Saturday"; break;
            case 7 : day = "Sunday"; break;
            default :
                System.out.println("\nInvalid Value Please Enter Number Again between 1 to 7.");
        }

        String type = "";
        if ( num >= 1 && num <= 5 ) {
            System.out.println("Day is: " + day + " - " + "Weekday");
        } else if ( num <= 6 && num >= 7 )  {
            System.out.println("Day is: " + day + " - " + "Weekend");
        }

    }

}
