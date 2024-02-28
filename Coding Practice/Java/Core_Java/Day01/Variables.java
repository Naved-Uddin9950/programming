// Day 01 of Java + DSA

// Homework problem 01 : 
// Try to declare meaningful variables of each type. Eg - a variable
// named age should be a numeric type (int or float) not byte

public class Variables {
    public static void main(String args[]){
        String name = new String("Naved"); // Declares a new string with value
        int age = 21;
        double income = 18000;
        boolean is_student = true;

        System.out.printf("Name         : %s \n", name);        // %s for strings
        System.out.printf("Age          : %d \n", age);         // %d for integer values
        System.out.printf("Income       : %.2f \n", income);    // %.2f for 2 decimal floating values
        System.out.printf("Is Student ? : %b \n", is_student);  // %b for boolean
    }
}