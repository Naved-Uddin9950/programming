// Homework problem 05 :
// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package Core_Java.Day09;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        vote(age);
    }

    public static void vote(int age) {
        if(age>=18) {
            System.out.println("You are eligible to vote.");
        } else if (age>=0) {
            System.out.println("You are a kid.");
        } else {
            System.out.println("Invalid age. Please enter your age as a positive number.");
        }
    }
}
