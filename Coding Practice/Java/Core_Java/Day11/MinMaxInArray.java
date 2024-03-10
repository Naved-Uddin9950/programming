// Homework problem 03 :
// Find the maximum & minimum number in an array of integers.

package Core_Java.Day11;
import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0;
        int min = 0;
        for(int i=0; i<arr.length; i++) {
            System.out.printf("Enter value at index %d : ", i);
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }

            if(min>arr[i]) {
                min = arr[i];
            }
        }

        System.out.printf("Maximum number is : %d \n", max);
        System.out.printf("Minimum number is : %d \n", min);
    }
}
