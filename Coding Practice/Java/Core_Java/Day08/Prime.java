// Homework problem 03 :
// Make a function to check if a number is prime or not.

package Core_Java.Day08;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean res = checkPrime(num);
        if(res) {
            System.out.printf("%d is a prime number.", num);
        }else{
            System.out.printf("%d is not a prime number.", num);
        }
    }

    public static boolean checkPrime(int num) {
       boolean isPrime = true;

       for(int i=2; i<num; i++) {
           if(num % i == 0) {
               isPrime = false;
               break;
           }
       }

       return isPrime;
    }
}
