// Practice 02 :
// Selection Sort Algorithm.

package Core_Java.Day23;

public class Practice02 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 9, 1, 4, 3, 8, 7, 6};
        System.out.print("Original Array : ");
        printArray(arr);
        // Time complexity = O(n^2)
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
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
