// Homework problem 05
// Print the pattern (Inverted Half Pyramid --- Rotated by 180 deg)
//    *
//   **
//  ***
// ****

package Core_Java.Day05;
import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++) {
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// Note : Struggled in this pattern. Need to practice it more

// Solution :

//    * ---> row-i space and i stars
//   **
//  ***
// ****

// It's printing n-1 spaces for every line and i stars