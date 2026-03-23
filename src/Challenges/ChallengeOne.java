/* Challenge 1

Input: number
Output:

Even/Odd
Last digit even या odd
First digit > last digit ? */

package Challenges;
import java.util.*;

public class ChallengeOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking Input
        System.out.print("\nPlease enter a Number: ");
        int num = input.nextInt();

        //Even or Odd
        System.out.println(num % 2 == 0 && num > 50 ? "Number " + num + " is Even & Greater Than 50 " : "number " + num + " is Not Even & Not Greater Than 50");
        System.out.println(num % 2 == 0 && num <= 50 ? "Number " + num + " is Even & Less Than Equal to 50" : "Number " + num + " is Not Even & Not Less Than 50");
        System.out.println(num % 2 != 0 ? "Number " + num + " is Odd" : "Number " + num + " is Not Odd");

    }

}
