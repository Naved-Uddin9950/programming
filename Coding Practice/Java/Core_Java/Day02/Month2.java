//Homework problem 05 in a more efficient way

import java.util.Scanner;

public class Month2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] month = new String[12];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";

        System.out.print("Enter number of a month : ");
        int num = sc.nextInt();

        if(num >0 && num<=12){
            for(int i = 0; i <= 12; i++) {
                if(num == i){
                    System.out.println(month[--i]);
                    break;
                }
            }
        }else{
            System.out.println("Invalid number. Please enter a number between 1 and 12");
        }

    }
}