// Homework problem 01 :
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//      {3, 4, 6, 2} is not sorted in ascending order.
package Core_Java.Day12;
import java.util.Scanner;

public class LinearSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++) {
            System.out.printf("Enter value of element of %d index : ", i);
            arr[i] = sc.nextInt();
        }
        boolean isSort = true;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSort = false;
                break;
            }
        }

        if(isSort) {
            System.out.println("It is in ascending order.");
        }else {
            System.out.println("It is not in ascending order.");
        }
    }
}
