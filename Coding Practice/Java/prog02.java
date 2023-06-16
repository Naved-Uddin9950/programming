public class prog02{
    public static void main(String[] args){
        double num1 = 1.4354354387634567d;
        int num2 = (int) num1;
        System.out.println(num1 + "\n" + num2);

        String name1 = new String("Naved");
        String name2 = new String("Naved");
        System.out.println(name1==name2);

        int a = 10;
        int b = 5;
        System.out.println("Maximum value: " + (a>b?a:b));
        System.out.println("Minimum value: " + (a<b?a:b));
        // int c = a>b?a:b;
        // System.out.println("Maximum value: " + c);
    }
}