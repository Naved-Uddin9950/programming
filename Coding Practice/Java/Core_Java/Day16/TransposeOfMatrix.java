// Homework problem 01 :
// For a given matrix of N x M, print its transpose.

package Core_Java.Day16;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter matrix : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of the above matrix is : ");
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
