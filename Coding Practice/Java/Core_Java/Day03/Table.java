// Homework problem 03
// Print the table of a number input by the user.

package Core_Java.Day03;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.printf("Table of %d is : \n", num);
        for(int i=1; i<=10; i++) {
            System.out.println(num*i);
        }
    }
}
