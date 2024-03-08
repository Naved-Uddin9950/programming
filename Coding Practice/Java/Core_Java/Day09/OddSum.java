// Homework problem 02 :
// Write a function to print the sum of all odd numbers from 1 to n.

package Core_Java.Day09;
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextInt();
        long res = sum(num);
        System.out.printf("Sum of all odd numbers from 1 to %d is %d", num, res);
    }

    public static long sum(long num) {
        long sum = 0;
        for(int i=1; i<=num; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
