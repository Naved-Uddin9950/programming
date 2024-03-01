// Homework problem 05
// Run
// for(; ;) {
// System.out.println("Apna College");
// }
// loop on your system and analyze what happens. Try to think of the reason for
// the output produced.

package Core_Java.Day03;

public class InfiniteLoop {
    public static void main(String[] args) {
        //  It will run an intifite loop
        for(; ;) { // Here we didn't initialized a variable and we didn't gave the condition in which the loop have to stop, the loop runs infinitely because of the missing condition
            System.out.println("Apna College");
        }
    }
}
