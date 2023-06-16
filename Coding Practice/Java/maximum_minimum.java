public class maximum_minimum{
    public static void main(String[] args){
        float num1_temp = 10.43f;
        float num2_temp = 5.325f;
        int num1 = (int) num1_temp;
        int num2 = (int) num2_temp;
        // System.out.println(num1 + "\n" + num2);


        // with ternary operator:
        System.out.println("Max value: " + (num1>num2?num1:num2));
        System.out.println("Min value: " + (num1<num2?num1:num2));


        // with if else statement:
        if(num1>num2){
            System.out.println("Maximum is: " + num1);
            System.out.println("Minimum is: " + num2);
        }
        else if(num1<num2){
            System.out.println("Maximum is: " + num2);
            System.out.println("Minimum is: " + num1);
        }
        else{
            System.out.println("Both are same values");
        }
    }
}