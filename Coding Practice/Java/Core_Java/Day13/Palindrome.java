// Practice 02 :
// Write a program to check if number is palindrome or not

package Core_Java.Day13;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0;
        int originalNum = num;
        System.out.printf("Original Number : %d \n", num);
        while(num != 0) {
            int rem = num % 10;
            num = num / 10;
            rev = (rev * 10) + rem;
        }
        System.out.printf("Reverse Number : %d \n", rev);

        if(originalNum == rev) {
            System.out.printf("%d is a palindrome number. \n", originalNum);
        } else{
            System.out.printf("%d is not a palindrome number. \n", originalNum);
        }
    }
}
