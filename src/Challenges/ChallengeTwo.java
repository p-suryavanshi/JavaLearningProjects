package Challenges;

import java.util.Scanner;

public class ChallengeTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease enter a Number: ");
        int num = input.nextInt();

        System.out.println( num % 2 == 0 && num % 3 == 0 ? "2 & 3" : num % 2 == 0 ? "Only 2" : num % 3 == 0 ? "Only 3" : "None" );

    }

}
