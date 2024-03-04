// Homework problem 03
// Print the pattern (Half Pyramid) :
// *
// **
// ***
// ****

package Core_Java.Day05;
import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// Solution :

//*    ---> 1
//**   ---> 2
//***  ---> 3
//**** ---> 4

//number of stars in every row is equals to i