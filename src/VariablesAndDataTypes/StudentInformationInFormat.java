package Basic;
import java.util.*;

public class StudentInformationInFormat {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n*** Welcome to the Student Information Printer in Format ***\n");

        System.out.print("Please enter the Name of the Student: ");
        String name = input.nextLine();

        System.out.print("Now, enter the Age of the Student: ");
        int age = input.nextInt();

        System.out.print("Now,enter the Course of the Student: ");
        String course = input.next();

        System.out.println("\n-----------------------------");
        System.out.println("     STUDENT INFORMATION     ");
        System.out.println("-----------------------------");
        System.out.println("Name:   " + name );
        System.out.println("Age:    " + age );
        System.out.println("Course: " + course );
        System.out.println("-----------------------------");
    }
}
