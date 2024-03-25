// Selection Sort Algorithm

package Core_Java.Day26;

public class Practice01 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 3, 2, 5, 7, 10, 4, 6, 9};
        int[] oldArr = arr.clone();
        System.out.println("Original Array : ");
        printArray(oldArr);
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[small]) {
                    small = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        System.out.println("Sorted Array : ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
