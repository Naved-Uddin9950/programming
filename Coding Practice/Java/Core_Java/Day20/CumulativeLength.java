// Homework problem 01 :
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings. (using String Builder)

package Core_Java.Day20;
import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        sc.nextLine();
        StringBuilder[] str = new StringBuilder[size];
        int len = 0;
        // Time complexity is O(n)
        for(int i=0; i<size; i++) {
            System.out.printf("Enter value of string at index %d : ", i);
            String input = sc.nextLine();
            str[i] = new StringBuilder(input);
            len += str[i].length();
        }
        System.out.printf("Cumulative length is : %d ", len);
    }
}
