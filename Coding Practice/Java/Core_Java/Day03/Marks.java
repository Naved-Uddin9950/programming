// Homework problem 06
// Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
// If the user enters 1 then keep taking input from the user for a student’s
// marks(out of 100).
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

package Core_Java.Day03;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("--------------- Student Marks Management System (Beta) ---------------");
            System.out.println("1 => Enter marks of the students.");
            System.out.println("0 => Exit the program. ");
            System.out.print("\nOption : ");
            int option = sc.nextInt();
            int student = 1;
            double marks = 0;

            if(option ==1){
                do {
                    System.out.printf("Enter marks of student %d : ", student);
                    marks = sc.nextDouble();

                    if(marks>=90 && marks<=100) {
                        System.out.println("This is Good\n");
                    } else if (marks>=60 && marks<=89) {
                        System.out.println("This is also Good\n");
                    } else if (marks>=0 && marks<=59) {
                        System.out.println("This is Good as well");
                        System.out.println("Because marks don’t matter but our effort does.\n");
                    } else {
                        System.out.println("Invalid marks. please enter marks between 0 to 100\n");
                    }
                    student++;
                } while (marks>0);
            } else if (option == 0) {
                break;
            }
        }
    }
}
