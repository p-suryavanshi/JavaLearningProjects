package OperatorsAndDecisionLogic.SmartCalculatorUsingSwitch;
import java.util.*;

public class SmartCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Smart Calculator ***\n");

        System.out.print("Please enter the First Number to Perform Operation: ");
        double firstNum = sc.nextDouble();

        System.out.print("Now, enter the Second Number: ");
        double secondNum = sc.nextDouble();

        System.out.print("Now enter the Operator (+, -, *, /, %) to Calculate: ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+' :
                System.out.println("\nThe Result of Addition is: " + (firstNum + secondNum));
                break;
            case '-' :
                System.out.println("\nThe Result of Subtraction is: " + (firstNum - secondNum));
                break;
            case '*' :
                System.out.println("\nThe Result of Multiplication is: " + (firstNum * secondNum));
                break;
            case '/' :
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero Please Try Again!");
                } else {
                    System.out.println("\nThe Result of Division is: " + (firstNum / secondNum));
                }
                break;
            case '%' :
                System.out.println("\nThe Remainder is: " + (firstNum % secondNum));
                break;
            default :
                System.out.println("\nYou have entered Invalid value Please Try Again!");
        }

    }

}
