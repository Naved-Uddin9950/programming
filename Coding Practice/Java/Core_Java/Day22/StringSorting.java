// Practice 01 :
// Write functions of sorting array of string in ascending and descending order

package Core_Java.Day22;

public class StringSorting {
    public static void main(String[] args) {
        String[] str = {"Naved", "Shinigami", "Basharat", "Izhar", "Rohit"};
        String[] asc = sortAsc(str.clone());
        String[] desc = sortDesc(str.clone());
        System.out.print("Original Array : ");
        printArray(str);
        System.out.print("Ascending Sorted Array : ");
        printArray(asc);
        System.out.print("Descending Sorted Array : ");
        printArray(desc);
    }
    // Function to sort array on ascending order
    public static String[] sortAsc(String[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int small = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[small].compareTo(arr[j]) > 0) {
                    small = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }
        return arr;
    }
    // Function to sort array in descending order
    public static String[] sortDesc(String[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int large = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[large].compareTo(arr[j]) < 0) {
                    large = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
        }
        return arr;
    }
    public static void printArray(String[] arr) {
        for(String i : arr) {
            System.out.printf("%s, ", i);
        }
        System.out.println();
    }
}
