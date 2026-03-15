package Basic;
import java.util.*;

public class MegabyteToGigabyteConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Memory Converter From MB to GB ***\n");

        System.out.print("Please eneter the Megabyte you want to converet into Gigabyte: ");
        double megabyte = input.nextDouble();

        double gigabyte = megabyte / 1024;

        System.out.println("Megabyte " + megabyte + " is converted into Gigabyte: " + gigabyte + "GB");
    }

}
