// Homework problem 02 : 
// Make a program that prints the table of a number that is input by
// the user.

import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num*i);
        }

        sc.close();
    }
}