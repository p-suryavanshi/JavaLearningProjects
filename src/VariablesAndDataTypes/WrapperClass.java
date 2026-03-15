package Basic;
import java.util.*;

public class WrapperClass {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("/n*** Welcome to the Wrapper Class (Autoboxing & Unboxing) ***\n");

        System.out.print("Please enter a Byte Number: ");
        byte numByte = input.nextByte();
        Byte byteNum = numByte;
        byte unByte = byteNum;

        System.out.print("Please enter an Interger Number: ");
        int numInt = input.nextInt();
        Integer intNum = numInt;
        int unInt = intNum;

        System.out.print("Please enter a Character: ");
        char numChar = input.next().charAt(0);
        Character charNum = numChar;
        char unChar = charNum;

        System.out.print("Please enter a Float Number(Decimal Number): ");
        float numFloat = input.nextFloat();
        Float floatNum = numFloat;
        float unFloat = floatNum;

        System.out.print("Please enter a Long Number: ");
        long numLong = input.nextLong();
        Long longNum = numLong;
        long unLong = longNum;

        System.out.print("Please enter a Double Number(Decimal Number): ");
        double numDouble = input.nextDouble();
        Double doubleNum = numDouble;
        double unDouble = doubleNum;

        System.out.print("Please enter a Boolean (true or false): ");
        boolean numBoolean = input.nextBoolean();
        Boolean booleanNum = numBoolean;
        boolean unBoolean = booleanNum;

        System.out.print("Please enter a Short Number: ");
        short numShort = input.nextShort();
        Short shortNum = numShort;
        short unShort = shortNum;

        System.out.println("\nAutoBoxing: Converting Premitive DataType into Wrapper Class as object\n");

        System.out.println("Your Byte Number " + numByte + " is Automatically converted into Wrapper Class Byte: " + byteNum);
        System.out.println("Your Byte Number " + numInt + " is Automatically converted into Wrapper Class Byte: " + intNum);
        System.out.println("Your Byte Number " + numChar + " is Automatically converted into Wrapper Class Byte: " + charNum);
        System.out.println("Your Byte Number " + numFloat + " is Automatically converted into Wrapper Class Byte: " + floatNum);
        System.out.println("Your Byte Number " + numLong + " is Automatically converted into Wrapper Class Byte: " + longNum);
        System.out.println("Your Byte Number " + numBoolean + " is Automatically converted into Wrapper Class Byte: " + booleanNum);
        System.out.println("Your Byte Number " + numShort + " is Automatically converted into Wrapper Class Byte: " + shortNum);

        System.out.println("\n--- Autoboxing Ended ---\n");

        System.out.println("\nAutoBoxing: Converting Wrapper Class as object into Premitive DataType\n");

        System.out.println("Your Wrapper Class object " + byteNum + " is Automatically converted into Premitive Byte DataType: " + unByte);
        System.out.println("Your Wrapper Class object " + intNum + " is Automatically converted into Premitive Byte DataType: " + unInt);
        System.out.println("Your Wrapper Class object " + charNum + " is Automatically converted into Premitive Byte DataType: " + unChar);
        System.out.println("Your Wrapper Class object " + floatNum + " is Automatically converted into Premitive Byte DataType: " + unFloat);
        System.out.println("Your Wrapper Class object " + longNum + " is Automatically converted into Premitive Byte DataType: " + unLong);
        System.out.println("Your Wrapper Class object " + booleanNum + " is Automatically converted into Premitive Byte DataType: " + unBoolean);
        System.out.println("Your Wrapper Class object " + shortNum + " is Automatically converted into Premitive Byte DataType: " + unShort);


        System.out.println("\n--- Unboxing Ended ---\n");

    }

}
