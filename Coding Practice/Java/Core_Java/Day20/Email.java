// Homework problem 03 :
// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example :
//          email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//          email = “helloWorld123@gmail.com”; username = “helloWorld123”

package Core_Java.Day20;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String str = sc.next();
        StringBuilder email = new StringBuilder(str);
        StringBuilder user = new StringBuilder(email);
        // Time complexity = O(n)
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                user.delete(i, user.length());
            }
        }
        System.out.printf("Email Address : %s \n", email);
        System.out.printf("Username : %s \n", user);
    }
}
