package VariablesAndDataTypes;
import java.util.*;

public class CharToIntergerConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Character to Interger Converter ---\n");

        System.out.print("Please enter a Character to Convert into Interger: ");
        char ch = input.next().charAt(0);

        int charToInt = ch;

        System.out.println("Your Character " + "'" + ch + "'" + " is converted into Interger: " + charToInt);

    }

}
