// Homework problem 02 : 
// Make a program that takes the radius of a circle as input,
// calculates its radius and area and prints it as output to the user.

import java.util.Scanner;

public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float radius = sc.nextFloat();
        final double pi = 3.14159; // Declares constent using final keyword

        double area = pi * radius * radius;

        System.out.printf("Area of a circle with %.2f radius is : %.2f", radius, area);

        sc.close();
    }
}