// Practice 05 :
// Write a program to reverse an array

package Core_Java.Day13;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int rev[] = new int[size];
        for(int i=0; i<arr.length; i++) {
            System.out.printf("Enter value of element %d : ", i);
            arr[i] = sc.nextInt();
            rev[arr.length-(i+1)] = arr[i];
        }
        System.out.print("Original Array : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nReversed Array : ");
        for(int i=0; i<rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}
