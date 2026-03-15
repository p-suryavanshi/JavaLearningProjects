package VariablesAndDataTypes;

import java.util.*;

public class PremitiveDataTypes {

        static Scanner input = new Scanner(System.in);

        public static int integerDataType(){

            System.out.print("\nPlease enter an Interger number: ");
            int num = input.nextInt();

            return num;
        }

        public static char charcterDataType(){

            System.out.print("\nPlease enter a Character: ");
            char ch = input.next().charAt(0);

            return ch;
        }

        public static float floatDataType(){

            System.out.print("\nPlease enter Floating Number: ");
            float num = input.nextFloat();

            return num;
        }

        public static double doubleDataType(){

            System.out.print("\nPlease enter Floating Point number: ");
            double num = input.nextDouble();

            return num;
        }

        public static long longDataType(){

            System.out.print("\nPlease enter a number: ");
            long num = input.nextLong();

            return num;

        }

        public static short shortDataType(){

            System.out.print("\nPlease enter a number: ");
            short num = input.nextShort();

            return num;
        }

        public static Boolean booleanDataType(){

            System.out.print("\nPlease enter a True or False: ");
            boolean bool = input.nextBoolean();

            return bool;

        }

        public static byte byteDataType(){

            System.out.print("\nPlease enter a number byte: ");
            byte num = input.nextByte();

            return num;

        }

        public static int choice(){

            System.out.println("\nPlease Choose the number between 1 to 8: ");
            int choice = input.nextInt();

            return choice;
        }


    public static void main(String[] args) {

        System.out.println("\n*** Welcome to the Premitive DataType Printer ***\n");

        System.out.print("Please Select the DataType You want to print: \n");
        System.out.println("1. Int");
        System.out.println("2. Char");
        System.out.println("3. Float");
        System.out.println("4. Double");
        System.out.println("5. long");
        System.out.println("6. Short");
        System.out.println("7. Boolean");
        System.out.println("8. Byte");

        int choice = choice();

        if ( choice == 1 ){
            System.out.println("\nYou Entered: " + integerDataType() + " Integer DataType" );
        } else if ( choice == 2 ) {
            System.out.println("\nYou Entered: " + charcterDataType() + " Charcter DataType");
        } else if ( choice == 3 ) {
            System.out.println("\nYou Entered: " + floatDataType() + " Floating Point Numbers DataType");
        } else if ( choice == 4 ) {
            System.out.println("\nYou Entered: " + doubleDataType() + " Double DataType");
        } else if ( choice == 5 ) {
            System.out.println("\nYou Entered: " + longDataType() + " Long DataType");
        } else if ( choice == 6 ) {
            System.out.println("\nYou Entered: " + shortDataType() + " ShortDataType");
        } else if ( choice == 7 ) {
            System.out.println("\nYou Entered: " + booleanDataType() + " Boolean DataType");
        } else if (choice == 8 ) {
            System.out.println("\nYou Entered: " + byteDataType() + " Byte DataType");
        } else {
            System.out.println("\nYou Hava Entered Invalid DataType.");
        }


    }
}
