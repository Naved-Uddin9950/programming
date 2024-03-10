// Random OTP Generator.

package Core_Java.Day11;

public class Practice02 {
    public static void main(String[] args) {
        String format = "0123456789";
        String otp = "";
        for(int i=1; i<=4; i++) {
            int rand = (int) Math.floor(Math.random() * 10);
            otp += format.charAt(rand);
        }

        System.out.printf("Random OTP is : %s", otp);
    }
}
