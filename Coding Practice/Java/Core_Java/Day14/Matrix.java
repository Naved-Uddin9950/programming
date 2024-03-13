// Homework problem 01 :
// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

package Core_Java.Day14;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int[][] matx = new int[rows][cols];
        boolean isFound = false;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.printf("Enter value of row %d column %d : ", i, j);
                matx[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number x to find : ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matx[i][j] == x) {
                    System.out.printf("Number %d is found at the indices of [%d][%d]", x, i, j);
                    isFound = true;
                    break;
                }
            }
        }
        if(!isFound) {
            System.out.printf("%d is not found in the matrix. Please try to enter a number that exists in the matrix.", x);
        }
        sc.close();
    }
}
