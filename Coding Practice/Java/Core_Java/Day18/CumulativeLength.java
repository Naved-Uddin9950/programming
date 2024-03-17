// Homework problem 01 :
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
//
package Core_Java.Day18;
import java.util.Scanner;

public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] str = new String[size];
        int len = 0;
        for(int i=0; i<size; i++) {
            System.out.printf("Enter value of string of index %d : ", i);
            str[i] = sc.nextLine();
            len += str[i].length();
        }
        System.out.printf("Cumulative length of all the strings in array is : %d", len);
    }
}
