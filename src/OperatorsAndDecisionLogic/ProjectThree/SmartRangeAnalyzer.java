package OperatorsAndDecisionLogic.ProjectThree;
import java.util.*;

public class SmartRangeAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smart Range Analyzer ***\n");

        System.out.print("Please enter a Number: ");
        int num = input.nextInt();

        System.out.print("\nNow, enter Range 1 Start: ");
        int range1Start = input.nextInt();
        System.out.print("Now,  enter Range 1 End: ");
        int range1End = input.nextInt();

        System.out.print("\nNow, enter Range 2  Start: ");
        int range2Start = input.nextInt();
        System.out.print("Now, enter Range 2 End: ");
        int range2End = input.nextInt();

        //In Range 1 or Not
        if ( num >=  range1Start && num <= range1End ) {
            System.out.println("\nIn Range 1: Yes");
        }  else {
            System.out.println("In Range 1: No");
        }

        //In Range 2 or Not
        if ( num >= range2Start && num <=range2End ) {
            System.out.println("In Range 2: Yes");
        } else {
            System.out.println("In Range 2: No");
        }

        //In Both Range 1 and Range 2
        if ( (num >= range1Start && num <= range1End) && (num >= range2Start && num <= range2End) ) {
            System.out.println("In Both Range 1 & Range 2: Yes");
        } else {
            System.out.println("In Both Range 1 & Range 2: No");
        }

        //Outside Both Range 1 and Range 2
        if ( !(num >= range1Start && num <= range1End) && !(num >= range2Start && num <= range2End) ) {
            System.out.println("Outside Both Range 1 & Range 2: Yes");
        } else {
            System.out.println("Outside Both Range 1 & Range 2: No");
        }

        //On Boundary or Not
        if ( (num == range1Start || num == range1End) || (num == range2Start || num == range2End) ) {
            System.out.println("On Boundary: Yes");
        } else {
            System.out.println("On Boundary: No");
        }

    }

}
