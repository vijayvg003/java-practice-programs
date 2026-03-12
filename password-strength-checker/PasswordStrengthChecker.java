import java.util.Scanner;
public class PasswordStrengthChecker {

    public static void checkPasswordStrength(String password) {
        int strength = 0;
      
        // Check password length
        if (password.length() >= 8) {
            strength++;
        }

        // Check uppercase letter
        if (password.matches(".*[A-Z].*")) {
            strength++;
        }

        // Check lowercase letter
        if (password.matches(".*[a-z].*")) {
            strength++;
        }

        // Check numeric digit
        if (password.matches(".*[0-9].*")) {
            strength++;
        }

        // Check special character
        if (password.matches(".*[!@#$%^&*()].*")) {
            strength++;
        }

        // check password strength
        if (strength <= 2) {
            System.out.println("Password Strength: Weak");
        } else if (strength == 3 || strength == 4) {
            System.out.println("Password Strength: Medium");
        } else {
            System.out.println("Password Strength: Strong");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        checkPasswordStrength(password);

        scanner.close();
    }
}
