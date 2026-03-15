package VariablesAndDataTypes;
import java.util.*;

public class GigabyteToMegabyteMemoryConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Memory Converter from Gigabyte to Megabyte ***\n");

        System.out.print("Please enter the Gigabyte(GB): ");
        double gigabyte = input.nextDouble();

        double megabyte = gigabyte * 1024;

        System.out.println("The Megabyte of Gigabyte " + gigabyte + " is: " + megabyte + "MB");

    }

}
