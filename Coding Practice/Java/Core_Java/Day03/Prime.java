// Homework problem 07
// Print if a number is prime or not (Input n from the user).


package Core_Java.Day03;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.printf("%d is a Prime number.", num);
        } else {
            System.out.printf("%d is not a Prime number.", num);
        }
    }
}