package OperatorsAndDecisionLogic.TrafficLightSimulator;
import java.util.*;

public class TrafficLightSimulator {

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Traffic Light Simulator ***\n");

        System.out.print("Please enter the Colour (Red, Yellow, Green): ");
        String colour = sc.nextLine().toLowerCase();

        switch (colour) {

            case "red" :
                System.out.println("Stop");
                break;
            case "yellow" :
                System.out.println("Prepare to go");
                break;
            case "green" :
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal!");
        }

    }

}
