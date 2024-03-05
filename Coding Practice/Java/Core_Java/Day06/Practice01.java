package Core_Java.Day06;

public class Practice01 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String rev = "";

        for(int i=str.length() - 1; i>=0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}
