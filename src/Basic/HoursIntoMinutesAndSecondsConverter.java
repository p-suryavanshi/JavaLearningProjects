package Basic;
import java.util.*;

public class HoursIntoMinutesAndSecondsConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Hourse to Minutes & Seconds Converter ---\n");

        System.out.print("Please enter the Hours: ");
        int hours = input.nextInt();

        int minutes = hours * 60;
        int finalSeconds = minutes * 60 ;

        System.out.println("Your given Hours " + hours + " is converted into Minutes & Seconds: " + minutes + "Minutes " + finalSeconds + "Seconds");

    }

}
