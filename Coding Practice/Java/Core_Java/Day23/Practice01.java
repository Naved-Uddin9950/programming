// Practice 01 :
// Bubble Sort Algorithm.

package Core_Java.Day23;

public class Practice01 {
    public static void main(String[] args) {
        int[] ogArr = {2, 5, 10, 9, 1, 4, 3, 8, 7, 6};
        int[] arr = ogArr.clone();
        System.out.print("Original Array : ");
        printArray(ogArr);
        // Time complexity = O(n^2)
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array : ");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for(int i : arr){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
