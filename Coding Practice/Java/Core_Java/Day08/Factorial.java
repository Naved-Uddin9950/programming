// Homework problem 02 :
// Write a function to calculate the factorial of a number.

package Core_Java.Day08;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextInt();
        long factorial = factorial(num);
        System.out.printf("Factorial of %d is %d", num, factorial);
    }

    public static long factorial(long num) {
        if(num == 0 || num == 1) {
            return 1;
        } else if(num < 0) {
            System.out.println("Invalid number. Number have to be a positive number.");
        }
        long facto = 1;
        for(long i=num; i>=2; i--) {
            facto *= i;
        }
        return facto;
    }
}
