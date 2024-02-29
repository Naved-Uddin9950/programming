// Homework problem 02 : 
// Check if given number is even or odd number.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Given number is an even number.");
        }else{
            System.out.println("Given number is an odd number.");
        }

        sc.close();
    }
}