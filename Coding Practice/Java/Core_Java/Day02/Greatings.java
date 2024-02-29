// Homework problem 04 :
// Print the Greeting using switch statement :
// 	1 ----> Hello
// 	2 ----> Namaste
// 	3 ----> Bonjour

import java.util.Scanner;

public class Greatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of button : ");
        int button = sc.nextInt();

        switch(button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2 :
                System.out.println("Namaste");
                break;

            case 3 :
                System.out.println("Bonjour");
                break;

            default :
                System.out.println("Invalid button");
        }
    }
}