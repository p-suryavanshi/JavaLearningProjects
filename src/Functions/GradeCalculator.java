package Functions;
import java.util.Scanner;

public class GradeCalculator {

    public static char Grade(int n) {

        if (n >= 90 ) {
            return 'A';
        } else if (n >= 75) {
            return 'B';
        } else if (n >= 60) {
            return 'C';
        } else {
            return 'D';
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Grade Calculator ===\n");

        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("\nYour grade is: " + Grade(marks));
    }

}