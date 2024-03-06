// Print Even or Odd number

package Core_Java.Day07;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num%2 == 0) {
            System.out.printf("%d is an even number", num);
        }else {
            System.out.printf("%d is an odd number", num);
        }
    }
}
