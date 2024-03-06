// Find maximum among 2 numbers

package Core_Java.Day07;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.printf("%d is greater than %d", num1, num2);
        } else if(num2>num1) {
            System.out.printf("%d is greater than %d", num2, num1);
        } else if(num1 == num2) {
            System.out.printf("%d and %d are both equals", num1, num2);
        } else {
            System.out.println("Enter valid integer numbers");
        }

        sc.close();
    }
}
