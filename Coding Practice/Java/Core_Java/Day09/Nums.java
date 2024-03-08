// Homework problem 07 :
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

package Core_Java.Day09;
import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int num = sc.nextInt();
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        double[] arr = new double[num];
        for(int i=0; i<num; i++) {
            System.out.printf("Enter number %d : ", i+1);
            arr[i] = sc.nextDouble();
            if(arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.printf("Positive numbers : %d \n", positive);
        System.out.printf("Negative numbers : %d \n", negative);
        System.out.printf("Zeros : %d \n", zeros);
    }
}
