public class typecasting{
    public static void main(String args[]){
        byte num1 = 10;
        byte num2 = 20;
        int result = (byte) (num1 + num2);
        System.out.printf("%d + %d = %d \n",num1,num2,result);

        double pi = 3.14159265359d;
        int newPi = (int) pi;
        System.out.println(newPi);
    }
}