package OperatorsAndDecisionLogic.VowelOrConsonant;
import java.util.*;

public class VowelOrConsonant {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Vowel or Consonant Checker ***\n");

        System.out.print("Please enter a Single Character: ");
        char singleChar = sc.next().toLowerCase().charAt(0);

        switch ( singleChar ) {

            case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
                System.out.println("\nCharacter " + singleChar + " is Vowel.");
                break;
            case 'b' : case 'c' : case 'd' : case 'f' : case 'g' : case 'h' : case 'j' : case 'k' : case 'l' : case 'm' : case 'n' : case 'p'  : case 'q' : case 'r' : case 's'  : case 't' : case 'v' : case 'w' : case 'x' : case 'y' : case 'z' :
                System.out.println("\nCharacter " + singleChar + " is Consonant.");
                break;
            default :
                System.out.println("\nYou have entered Invalid Value Please Try Again!");

        }

    }

}
