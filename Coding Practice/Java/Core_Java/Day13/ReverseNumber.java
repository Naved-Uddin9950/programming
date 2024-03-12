// Practice 01
// Write a program to reverse a number.

package Core_Java.Day13;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int rev = 0;
        System.out.printf("Number : %d \n", num);
        while(num != 0) {
            int rem = num % 10;
            num = num / 10;
            rev = (rev * 10) + rem;
        }
        System.out.printf("Reverse Number : %d \n", rev);
    }
}
