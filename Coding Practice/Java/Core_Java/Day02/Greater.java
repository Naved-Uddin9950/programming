// Homework problem 03 : 
// Given two values a and b, check and print if a is greater, b is greater or both are equals.

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }else if(a<b){
            System.out.println("b is greater than a");
        }else if(a==b){
            System.out.println("both a and b are equal");
        }else{
            System.out.println("Invalid input. Please enter integer numbers in a and b.");
        }
    }
}