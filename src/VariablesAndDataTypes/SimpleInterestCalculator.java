package VariablesAndDataTypes;
import java.util.*;

public class SimpleInterestCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Simple Interest Calculator ---\n");

        System.out.print("Please enter the Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Now, enter the year on Loan you want to take: ");
        int year = input.nextInt();

        System.out.print("Now, enter the Interest rate of per year in Percentage: ");
        double interestrate = input.nextDouble();

        double simpleInterest = loanAmount * interestrate * year / 100;
        double totalLoanAmount = loanAmount + simpleInterest;

        System.out.println("The total Interest Rate is: " + simpleInterest );
        System.out.println("The total Loan Amount is: " + totalLoanAmount );
    }

}
