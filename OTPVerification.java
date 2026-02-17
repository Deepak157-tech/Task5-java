import java.util.Random;
import java.util.Scanner;

public class OTPVerification {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int otp = 100 + rand.nextInt(200);
        System.out.println("Generated OTP: " + otp);

        System.out.print("Enter OTP: ");
        int userOtp = sc.nextInt();

        if (otp == userOtp) {
            System.out.println("OTP Verified Successfully!");
        } else {
            System.out.println("Invalid OTP!");
        }
    }
}
