// Homework problem 03 :
// Write a function which takes in 2 numbers and returns the greater of those two.

package Core_Java.Day09;
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int res = greater(num1, num2);
        System.out.printf("Greater number among %d and %d is %d", num1, num2, res);
    }

    public static int greater(int num1, int num2) {
        if(num1>num2) {
            return num1;
        } else if(num2>num1) {
            return num2;
        }

        System.out.println("Both numbers are equal.");
        return 0;
    }
}
