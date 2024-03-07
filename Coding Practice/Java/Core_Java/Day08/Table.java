// Homework problem 05 :
// Make a function to print the table of a given number n.

package Core_Java.Day08;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.printf("Table of %d is : \n", num);
        table(num);
    }

    private static void table(int num) {
        for(int i=1; i<=10; i++) {
            System.out.println(num*i);
        }
    }
}
