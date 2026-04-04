package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.*;

public class CharacterClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Character Classifier ***\n");

        String character;
        do {
            System.out.print("Please enter the Character: ");
            character = sc.nextLine().toLowerCase();

            switch (character) {
                case "a" : case "e" : case "i" : case "o" : case "u" :
                    System.out.println("Character " + character + " is Vowel.");
                    break;
                case "#" :
                    System.out.println("You have Exited the Program...");
                    break;
                default :
                    if (character.length() == 1 && Character.isLetter(character.charAt(0)) ) {
                        System.out.println("Character " + character + " is Consonant.");
                    } else if (!character.equals("#")) {
                        System.out.println("Invalid Input! Please Enter a Letter.");
                    }
            }

        } while (!character.equals("#"));

    }

}