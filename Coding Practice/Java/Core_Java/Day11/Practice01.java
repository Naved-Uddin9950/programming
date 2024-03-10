// Random password generator.

package Core_Java.Day11;

public class Practice01 {
    public static void main(String[] args) {
        String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*~";
        String randPass = "";
        for(int i=1; i<=16; i++) {
            int rand = (int) Math.floor(Math.random() * 71);
            randPass += pass.charAt(rand);
        }

        System.out.printf("Random password is : %s", randPass);
    }
}
