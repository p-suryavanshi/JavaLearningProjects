package Basic;
import java.util.*;

public class TotalLoanAmountCalculator {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Total Loan Amount Calculator ***\n");

        System.out.print("Please enter the Principle Amount: ");
        double principleAmount = input.nextDouble();

        System.out.print("Now, enter the Interest rate of per year in Percentage: ");
        double interestRate = input.nextDouble();

        System.out.print("Now, enter the Time you have taken or given the Loan: ");
        double time = input.nextDouble();

        double totalAmount = principleAmount * interestRate * time / 100;

        System.out.println("\nYour Total Loan Amount is: " + totalAmount + "Rs.");

    }

}
