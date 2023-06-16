public class table{
    public static void main(String[] args){
        long num = 786l;
        int i = 1;

        // with for loop: 
        for(i=1;i<=10;i++){
            System.out.println(num*i);
        }
        System.out.println("\n\n");
        num = 3;
        i = 1;


        // with while loop: 
        while (i<=10) {
            System.out.println(num*i);
            i++;
        }
        System.out.println("\n\n");
        num = 5;
        i = 1;


        // with do while loop:
        do{
            System.out.println(num*i);
            i++;
        }while(i<=10);
    }
}