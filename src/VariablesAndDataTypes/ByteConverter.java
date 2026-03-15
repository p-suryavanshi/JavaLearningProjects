package VariablesAndDataTypes;
import java.util.*;

public class ByteConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome To the Memory Converter ---\n");

        System.out.print("Please enter the Byte you want to Convert into KiloByte (KB) and MegaByte (MB): ");
        double num = input.nextDouble();

        double kiloByte = num / 1024;
        double megaByte = kiloByte / 1024;

        System.out.printf("\nThe KiloByte of your given Number is: %.6f KB\n", kiloByte);
        System.out.printf("The MegaByte of your given Number is: %.10f MB\n", megaByte);

    }

}
