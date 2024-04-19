package DSA;

//Linear Search Algorithm

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter value of item to find : ");
        int item = sc.nextInt();
        boolean isFound = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == item) {
                System.out.printf("Item %d found at index : %d", item, i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.printf("Item %s not found in array", item);
        }
    }
}
