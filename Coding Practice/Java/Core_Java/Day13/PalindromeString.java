// Practice 04 :
// Write a program to check if given string is palindrome or not

package Core_Java.Day13;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String originalString = str;
        String rev = "";
        System.out.printf("Original String : %s \n", str);
        for(int i = str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.printf("Reversed String : %s \n", rev);
        if(originalString.equals(rev)) {
            System.out.printf("%s is a palindrome string \n", originalString);
        } else {
            System.out.printf("%s is not a palindrome string \n", originalString);
        }
    }
}
