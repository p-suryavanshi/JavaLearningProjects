package Challenges;
import java.util.*;

public class ChallengeFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Largest Number Finder ***\n");

        System.out.print("Please enter First Number: ");
        int firstNum = input.nextInt();

        System.out.print("Now, enter the Second Number: ");
        int secondNum = input.nextInt();

        System.out.print("Now, enter the Third Number: ");
        int thirdNum = input.nextInt();

        System.out.println(firstNum > secondNum && firstNum > thirdNum ? "First Number " + firstNum + " is Largest Number." : secondNum > thirdNum ? "Second Number " + secondNum + " is Largest Number." : "Third Number " + thirdNum + " is Largest Number.");

    }

}
