// Practice 01 :
// Spiral Order Matrix

package Core_Java.Day24;

public class Practice01 {
    public static int row = 3;
    public static int col = 3;
    public static void main(String[] args) {
        int[][] mat = new int[row][col];
        matrix(mat);
        printArray(mat);
        spiral(mat);
    }

    public static void spiral(int[][] mat) {
        int top = 0, bottom = row-1, left = 0, right = col-1;
        while(top <= bottom && left <=right) {
            for(int i=left; i<=right; i++) {
                System.out.printf("%d ", mat[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                System.out.printf("%d ", mat[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    System.out.printf("%d ", mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    System.out.printf("%d ", mat[i][left]);
                }
                left++;
            }
        }
    }

    public static void matrix(int[][] mat) {
        int counter = 1;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                mat[i][j] = counter;
                counter++;
            }
        }
    }

    public static void printArray(int[][] arr) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
