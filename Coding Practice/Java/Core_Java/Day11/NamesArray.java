// Homework problem 02 :
// Take an array of names as input from the user and print them on the screen.

package Core_Java.Day11;
import java.util.Scanner;

public class NamesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        sc.nextLine(); // Consumes next line after taking input integer to avoid any error
        String names[] = new String[size];
        for(int i=0; i<names.length; i++) {
            System.out.printf("Enter value of name at index %d : ", i);
            names[i] = sc.nextLine();
        }
        System.out.println("Your entered these names : ");
        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
