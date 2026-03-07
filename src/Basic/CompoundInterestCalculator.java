package Basic;
import java.util.*;

public class CompoundInterestCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n--- Welcome to the Compound Interest Calculator ---\n");

        System.out.print("Please enter the Loan Amount (Principle Amount): ");
        double loanAmount = input.nextDouble();

        System.out.print("Now, enter The Time of Your Loan: ");
        int loanTime = input.nextInt();

        System.out.print("Now, enter the Interest Rate by per year in Percentage: ");
        double interestRate = input.nextDouble();

        double oneYearInterest = loanAmount * interestRate / 100;

        double totalInterestRate = oneYearInterest * interestRate / 100 ;

        double compoundInterest = oneYearInterest * loanTime + totalInterestRate;

        double totalLoanAmount = loanAmount + compoundInterest;

        System.out.println("\nThe Compound Interest is: " + compoundInterest );
        System.out.println("The Total End Loan Amount is: " + totalLoanAmount );

    }

}
