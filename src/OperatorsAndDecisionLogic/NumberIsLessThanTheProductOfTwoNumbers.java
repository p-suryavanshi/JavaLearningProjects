package operatorsAndDecisionLogic;
import java.util.*;

    public class NumberIsLessThanTheProductOfTwoNumbers {

        static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("\n*** Welcome to the Number Checker Number is Less Than the Product of Two Numbers ***\n");

            System.out.print("Please enter a Number: ");
            int num = input.nextInt();

            System.out.print("Now, enter the First Number to find Product: ");
            int firstNum = input.nextInt();

            System.out.print("Now, enter the Second Number to find Product: ");
            int secondNum = input.nextInt();

            int product = firstNum * secondNum;

            if ( num < product ) {
                System.out.println("Number " + num + " is less than the Product of Two Numbers " + firstNum + " and " + secondNum + ": " + product );
            } else {
                System.out.println("Number " + num + " is Not less than the Product of Two Numbers " + firstNum + " and " + secondNum + ": " + product );
            }
        }

    }