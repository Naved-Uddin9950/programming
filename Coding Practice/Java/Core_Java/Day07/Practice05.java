// Reverse a string

package Core_Java.Day07;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
