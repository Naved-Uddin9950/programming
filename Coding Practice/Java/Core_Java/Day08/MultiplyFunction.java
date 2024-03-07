// Homework problem 01 :
// Write a function to multiply 2 numbers.

package Core_Java.Day08;
import java.util.Scanner;

public class MultiplyFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        double multi = mult(num1, num2);
        System.out.printf("Multiplication of %.2f and %.2f is %.2f", num1, num2, multi);
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }
}
