// Homework problem 02
// Print the sum of first n natural numbers.

package Core_Java.Day03;
import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=num; i++){
            sum = sum + i;
        }

        System.out.printf("Sum of %d natural numbers is %d", num, sum);

        sc.close();
    }
}
