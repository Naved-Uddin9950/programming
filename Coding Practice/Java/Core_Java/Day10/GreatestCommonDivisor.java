// Homework problem 01 :
// Write a function that calculates the Greatest Common Divisor of 2 numbers.

package Core_Java.Day10;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int res = divisor(num1, num2);
        System.out.printf("Greatest common divisor of %d and %d is : %d", num1, num2, res);
    }

    public static int divisor(int num1, int num2) {
        int n = num1 + num2;
        int gcd = 0;
        for(int i=1; i<=n; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
