// Homework problem 03 :
// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example :
//          email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//          email = “helloWorld123@gmail.com”; username = “helloWorld123”.

package Core_Java.Day18;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = sc.next();
        String user = "";
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                user += email.charAt(i);
            }
        }
        System.out.printf("Email : %s \n", email);
        System.out.printf("Username : %s", user);
    }
}
