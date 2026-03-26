package OperatorsAndDecisionLogic.AtmMenuWithNestedLogic;
import java.util.*;

public class AtmMenuWithNestedLogic {

    public static String menu(String menu) {

        System.out.println("1. Check Balance");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdraw Money");

        return menu;
    }

        public static String option(String option){

            Scanner sc = new Scanner(System.in);

            System.out.print("\nPlease Enter the Option that you want: ");
            option = sc.nextLine().toLowerCase();

            return option;
        }

    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the ATM Menu ***\n");

        int balance = 5000;
        String gotoMenu = "";
        String menu;
        String option = "";

        menu(gotoMenu);

        option = option(option);

        switch (option) {

            case "check balance" : case "checkbalance" :
                System.out.println("\nYour Balance is: " + balance + " Rs.");

                System.out.print("Do yo Want to go on Menu (Y/n): ");
                menu = sc.nextLine().toLowerCase();

                switch (menu) {
                    case "y" :
                        menu(gotoMenu);
                        option = option(option);

                        break;
                    default:
                        System.out.println("You have Exited the Program.");
                }
                break;
            case "deposite money" : case "depositemoney" :
                System.out.print("\nPlease enter the Amount: ");
                int depositeAmount = sc.nextInt();
                System.out.println("Your Total Balance is: " + (balance += depositeAmount) + " Rs.");

                System.out.print("Do yo Want to go on Menu (Y/n): ");
                menu = sc.nextLine().toLowerCase();

                switch (menu) {
                    case "y" :
                        menu(gotoMenu);
                        option = option(option);

                        break;
                    default:
                        System.out.println("You have Exited the Program.");
                }
                break;
            case "withdraw money" : case "withdrawmoney" :
                System.out.print("\nPlease enter the Withdwar Money: ");
                int withdrawMoney = sc.nextInt();
                if ( withdrawMoney > balance ) {
                    System.out.println("Insufficient Balance");
                } else {
                    System.out.println("Your Amount " + withdrawMoney + " is Withdrawled and Your Total Balance is: " + (balance -= withdrawMoney) + " Rs.");
                }

                System.out.print("Do yo Want to go on Menu (Y/n): ");
                menu = sc.nextLine().toLowerCase();

                switch (menu) {
                    case "y" :
                        menu(gotoMenu);
                        option = option(option);

                        break;
                    default:
                        System.out.println("You have Exited the Program.");
                }
                break;
            default :
                System.out.println("\nYou have entered wrong option Please Try Again!");
                if ( (option != "checkbalance" || option != "check balance") && (option != "depositemoney" || option != "deposite money") && (option != "withdrawmoney" || option != "withdraw money") ) {
                    System.out.print("Do yo Want to go on Menu (Y/n): ");
                    menu = sc.nextLine().toLowerCase();

                    switch (menu) {
                        case "y" :
                            menu(gotoMenu);
                            option = option(option);

                            break;
                        default:
                            System.out.println("You have Exited the Program.");
                    }
                }
        }

    }

}
