// Homework problem 01
// Print the pattern (Solid Rectangle) :
// *****
// *****
// *****
// *****

package Core_Java.Day05;
import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
