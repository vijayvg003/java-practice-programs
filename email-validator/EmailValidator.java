import java.util.Scanner;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
      
        // Regex pattern for validate the email
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
      
        if (isValidEmail(email)) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
        scanner.close();
    }
}
