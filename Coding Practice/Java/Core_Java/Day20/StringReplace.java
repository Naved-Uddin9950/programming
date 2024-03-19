// Homework problem 02 :
// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
// Example :
//          original = “eabcdef’ ; result = “iabcdif”
//          Original = “xyz” ; result = “xyz”

package Core_Java.Day20;
import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder result = new StringBuilder(sb);
        // Time complexity = O(n)
        for(int i=0; i<result.length(); i++) {
            if(result.charAt(i) == 'e') {
                result.setCharAt(i, 'i');
            }
        }
        System.out.printf("Old String : %s \n", sb);
        System.out.printf("New String : %s \n", result);
    }
}
