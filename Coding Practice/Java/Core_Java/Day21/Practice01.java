// Program to Encrypt and Decrypt a message

package Core_Java.Day21;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message : ");
        String msg = sc.nextLine();
        String enc = "";
        String dec = "";
        int key = 100;

        // Encryption logic
        for(int i=0; i<msg.length(); i++) {
            char temp = (char) (msg.charAt(i) - key);
            enc += temp;
        }

        // Decryption logic
        for(int i=0; i<enc.length(); i++) {
            char temp = (char) (enc.charAt(i) + key);
            dec += temp;
        }

        System.out.printf("Original message : %s \n", msg);
        System.out.printf("Encrypted message : %s \n", enc);
        System.out.printf("Decrypted message : %s \n", dec);
    }
}
