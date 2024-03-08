// Homework problem 01 :
// Enter 3 numbers from the user & make a function to print their average.

package Core_Java.Day09;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number : ");
        double num3 = sc.nextDouble();

        double res = average(num1, num2, num3);

        System.out.printf("Average of %.2f, %.2f and %.2f is %.2f", num1, num2, num3, res);
    }

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3)/3;
    }
}
