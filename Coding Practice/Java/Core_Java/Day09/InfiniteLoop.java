// Homework problem 06 :
// Write an infinite loop using do while condition.

package Core_Java.Day09;

public class InfiniteLoop {
    public static void main(String[] args) {
        long num = 1;
        do {
            System.out.printf("This is an infinite loop. It iterated %d times already. \n", num);
            num++;
        } while(num>0);
    }
}
