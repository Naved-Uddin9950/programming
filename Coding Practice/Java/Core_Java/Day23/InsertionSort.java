// Homework problem 01 :
// Program of Insertion Sort Algorithm.

package Core_Java.Day23;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 9, 1, 4, 3, 8, 7, 6};
        System.out.print("Original Array : ");
        printArray(arr);
        // Time Complexity = O(n^2)
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
