package Basic;

import java.util.*;

public class LeastCommanMultiple {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Lowest Comman Multiple Number Calculator ***\n");

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();

        int lcm = leastCommanMultiple(num1,num2);

        System.out.println("LCM of your given number is: " + lcm );

    }

    public static int leastCommanMultiple(int num1, int num2){

        int i = 1;

        while ( true ){
            int factor = num1 * i;
            if (factor % num2 == 0 ){
                     return factor;
                }
            i++;
        }
    }

}
