// Homework problem 04 :
// Make a function to check if a given number n is even or not.

package Core_Java.Day08;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String res = evenOdd(num);
        System.out.printf("%d is an %s number", num, res);
    }

    public static String evenOdd(int num) {
        if(num % 2 == 0) {
            return "even";
        }

        return "odd";
    }
}
