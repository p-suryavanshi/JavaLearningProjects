package Functions;
import java.util.Scanner;

public class MiniAtmSystem {

    public static int atmTransaction(int currentBalance, int amount, int choice) {

        if (choice == 1) {
            return currentBalance + amount;
        } else if (amount > currentBalance) {
            return currentBalance;
        } else {
            return currentBalance - amount;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the ATM System  ===\n");

        int balance = 1000;

        System.out.println("Your balance is: " + balance);

        System.out.print("\nPlease 1 to Deposit, 2 to Withdraw: ");
        int choice = sc.nextInt();

        int amount = 0;

        switch (choice) {
            case 1, 2 :
                    System.out.print("Please enter the amount: ");
                    amount = sc.nextInt();
            break;

            default :
                System.out.println("You have entered wrong choice please try again!");
                break;
        }

        if (choice == 1 || choice == 2 ) {
            System.out.println("\nFinal Balance: " + atmTransaction(balance,amount,choice));
        }

    }

}