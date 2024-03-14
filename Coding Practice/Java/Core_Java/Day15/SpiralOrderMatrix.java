// Homework problem 01 :
// Print the spiral order matrix as output for a given matrix of numbers.
// Previously asked in top MNCs like Google, Microsoft, Amazon directly.

package Core_Java.Day15;
import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.printf("Enter value of indices of [%d][%d] : ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        int top = 0, bottom = row-1, left = 0, right = col-1;
        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                System.out.printf("%d, ", mat[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                System.out.printf("%d, ", mat[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    System.out.printf("%d, ", mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    System.out.printf("%d, ", mat[i][left]);
                }
                left++;
            }
        }
    }
}
