// Homework problem 04 :
// Write a function that takes in the radius as input and returns the circumference of a circle.

package Core_Java.Day09;
import java.util.Scanner;

public class Circle {
    static final double PI = 3.14159265359;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        double rad = sc.nextDouble();
        double res = circle(rad);
        System.out.printf("Circumference of circle with %.6f radius id : %.6f", rad, res);
    }

    public static double circle(double rad) {
        return 2 * PI * rad;
    }
}
