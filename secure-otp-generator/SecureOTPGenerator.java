import java.security.SecureRandom;
public class SecureOTPGenerator {

    public static String generateOTP(int length) {
        String digits = "1234567890";
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(); 
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            otp.append(digits.charAt(index)); 
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 6;
        String otp = generateOTP(otpLength);
        System.out.println("Generated Secure OTP: " + otp);
    }
}
