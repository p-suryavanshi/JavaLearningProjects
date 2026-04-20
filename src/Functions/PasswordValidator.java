package Functions;
import java.util.Scanner;

public class PasswordValidator {

    public static String ValidatePassword(String pass) {

        if (pass.length() < 8 ) {
            return "Weak (Length is Less than 8)";
        }

        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        if (hasDigit && hasSpecial) {
            return "Strong";
        } else {
            return "Weak";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Welcome to the Password Validator ===\n");

        System.out.print("Please enter the password: ");
        String pass = sc.nextLine();

        System.out.println("Password " + pass + " is: " + ValidatePassword(pass));

    }

}