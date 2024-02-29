// Homework problem 01 :
// Print adult if age is greater than 18 else print underage.

import java.util.Scanner;

public class AgeProg{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        boolean condition = age>=18; // Checks if age is greater or equals to 18 and store value in boolean
        boolean negcondi = age<0; // Store in boolean if age is smaller than zero (0) or negative

        if(condition) {
            System.out.println("You are an Adult.");
        }else if(negcondi) {
            System.out.println("You are currently underage.");
        }else{
            System.out.println("Invalid age. Please input a valid age in integer.");
        }

        sc.close();
    }
}