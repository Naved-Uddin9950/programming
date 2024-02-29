// Homework problem 06 :
// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
// ● 1 : + (Addition) a + b
// ● 2 : - (Subtraction) a - b
// ● 3 : * (Multiplication) a * b
// ● 4 : / (Division) a / b
// ● 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res;

        System.out.print("Enter value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter operator : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter value of b : ");
        double b = sc.nextDouble();

        switch(op) {
            case '+':
                res = a + b;
                break;

            case '-':
                res = a - b;
                break;

            case '*':
                res = a * b;
                break;

            case '/':
                res = a / b;
                break;

            case '%':
                res = a % b;
                break;

            default:
                System.out.println("Invalid input.");
                res = 0;
        }

        System.out.printf("%.2f %c %.2f is %.2f", a, op, b, res);

        sc.close();
    }
}