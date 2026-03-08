package Basic;
import java.util.*;

public class RupeesToPaiseConverter {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Ruppes to Paise Converter ---\n");

        System.out.print("Please enter the Ruppe Amount: ");
        double rupee = input.nextDouble();

        double paise = rupee * 100;

        System.out.println("Rupee " + rupee + " is converted into Paise: " + paise);

    }

}
