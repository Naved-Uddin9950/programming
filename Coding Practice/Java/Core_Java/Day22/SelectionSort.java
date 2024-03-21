// Homework problem 02 :
// Write an algorithm to sort elements of array in ascending order using Selection sort algorithm.

package Core_Java.Day22;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 10, 6, 4, 7, 9, 8};
        // Selection Sort Algorithm
        // Time complexity - O(n^2)
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        System.out.print("Sorted Array : ");
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
