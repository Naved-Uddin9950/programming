// Homework problem 01 :
// Write an algorithm to sort elements of array in ascending order using Bubble sort algorithm.

package Core_Java.Day22;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++) {
            System.out.printf("Enter value of element at index %d : ", i);
            arr[i] = sc.nextInt();
        }
        // Bubble Sort Algorithm
        // Time complexity - O(n^2)
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array is : ");
        // Enhanced for loop
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
    }
}
