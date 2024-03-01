// Homework problem 04
// Print all even numbers till n.

package Core_Java.Day03;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for(int i=2;i<=num;i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
