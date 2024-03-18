// Practice 01 :
// Leetcode easy problem --- Two Sum

package Core_Java.Day19;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.printf("Enter value of index %d : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int sum = sc.nextInt();
        boolean isSum = false;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.printf("Sum is at index of : %d, %d", i, j);
                    isSum = true;
                    break;
                } else {
                    isSum = false;
                }
            }
            if(isSum) {
                break;
            }
        }
        if(!isSum) {
            System.out.println("Sum is not found");
        }
    }
}
