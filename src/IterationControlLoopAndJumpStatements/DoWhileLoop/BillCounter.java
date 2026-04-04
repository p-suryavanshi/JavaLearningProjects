package IterationControlLoopAndJumpStatements.DoWhileLoop;
import java.util.Scanner;

public class BillCounter {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Bill Counter ***\n");

        double price;
        double sum = 0;
        char choice;
        do {

            System.out.print("Please enter item Price: ");
            price = sc.nextDouble();

            sum += price;

            System.out.print("Add more items (Y/N): ");
            choice = sc.next().charAt(0);


        } while (choice == 'y' || choice == 'Y');

        double gst = (sum * 18) / 100;
        double total = sum + gst;

        System.out.println("--- FINAL BILL ---");
        System.out.println("Subtotal: ₹" + sum );
        System.out.println("GST (18%): ₹" + gst);
        System.out.println("Grand Total: ₹" + total);

    }

}