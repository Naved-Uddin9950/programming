public class prog03{
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 4;
        byte num3 = (byte) (num1 + num2);
        System.out.println(num3);

        String name1 = new String("Naved");
        String name2 = new String("Naved");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        String a = "Shinigami";
        String b = "Shinigami";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        int x = 10;
        int y = 5;
        int z = x>y?x:y;
        System.out.println(z);
    }
}