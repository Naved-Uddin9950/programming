// Homework problem 02 :
// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 .....
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package Core_Java.Day10;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int prev = 0;
        int curr = 1;
        int fibo = prev + curr;
        System.out.println("Fibonacci Series : ");
        System.out.printf("%d, %d, ", prev, curr);
        for(int i=2; i<num; i++) {
            fibo = prev + curr;
            prev = curr;
            curr = fibo;
            System.out.printf("%d, ", fibo);
        }
    }
}
