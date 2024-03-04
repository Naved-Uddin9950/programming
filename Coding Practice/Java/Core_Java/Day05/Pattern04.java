// Homework problem 04
// Print the pattern (Inverted Half Pyramid) :
// ****
// ***
// **
// *

package Core_Java.Day05;
import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=row;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Struggled a little in this. Need to practice it more.