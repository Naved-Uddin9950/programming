// Homework problem 08 :
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥𝑛.

package Core_Java.Day09;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of base (x) : ");
        int x = sc.nextInt();
        System.out.print("Enter value of power (n) : ");
        int n = sc.nextInt();
        int res = pow(x, n);
        System.out.printf("Power of %d raised to power of %d is : %d", x, n, res);
    }

    public static int pow(int x, int n) {
        int pow = 1;
        for(int i=1; i<=n; i++) {
            pow *= x;
        }
        return pow;
    }
}
