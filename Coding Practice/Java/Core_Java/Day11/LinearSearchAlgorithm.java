// Homework problem 01 :
// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

package Core_Java.Day11;
import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.printf("Enter value of element %d : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number (x) to search in array : ");
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                System.out.printf("Element %d is found at index of : %d \n", x, i);
            }
        }
    }
}
