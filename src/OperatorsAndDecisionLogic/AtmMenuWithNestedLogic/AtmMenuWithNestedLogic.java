package OperatorsAndDecisionLogic.AtmMenuWithNestedLogic;
import java.util.*;

public class AtmMenuWithNestedLogic {

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the ATM Menu ***\n");

        int balance = 5000;

        System.out.println("Check Balance");
        System.out.println("Deposite Money");
        System.out.println("Withdraw Money");
        System.out.print("\nPlease Enter the Option that you want: ");
        String option = sc.nextLine().toLowerCase();

        switch (option) {

            case "check balance" : case "checkbalance" :
                System.out.println("\nYour Balance is: " + balance + " Rs.");
                break;
            case "deposite money" : case "depositemoney" :
                System.out.print("\nPlease enter the Amount: ");
                int depositeAmount = sc.nextInt();
                System.out.println("Your Total Balance is: " + (balance += depositeAmount) + " Rs.");
                break;
            case "withdraw money" : case "withdrawmoney" :
                System.out.print("\nPlease enter the Withdwar Money: ");
                int withdrawMoney = sc.nextInt();
                if ( withdrawMoney > balance ) {
                    System.out.println("Insufficient Balance");
                } else {
                    System.out.println("Your Amount " + withdrawMoney + " is Withdrawled and Your Total Balance is: " + (balance -= withdrawMoney) + " Rs.");
                }
                break;
            default :
                System.out.println("\nYou have entered wrong option Please Try Again!");
        }

    }

}
