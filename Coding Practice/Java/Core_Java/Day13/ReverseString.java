// Practice 03 :
// Write a program to reverse a string

package Core_Java.Day13;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String rev = "";
        System.out.printf("Original String : %s \n", str);
        for(int i = str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.printf("Reversed String : %s \n", rev);
    }
}
