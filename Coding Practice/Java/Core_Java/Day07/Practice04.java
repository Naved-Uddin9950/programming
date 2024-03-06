// Find maximum and minimum element of array

package Core_Java.Day07;

public class Practice04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr = new int[]{5, 4, 4, 2, 10, 3, 1, 6, 7, 1};
        int max = 0;
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            } else if(arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.printf("Max : %d \n", max);
        System.out.printf("Min : %d \n", min);
    }
}
