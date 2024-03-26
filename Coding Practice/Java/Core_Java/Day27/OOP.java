    // Homework problem 01 :
    // Write a program using class, object, constructor, new keyword, this keyword

    package Core_Java.Day27;

    public class OOP {
        public static void main(String[] args) {
            Student std1 = new Student("Naved Uddin", 1, "BCA", 92.8f);
            Student std2 = new Student("Basharat Khan", 2, "BCA", 95.9f);
            Student std3 = new Student("Rohit Moolchandini", 4, "BCA", 91.5f);
            Student std4 = new Student("Izhar Mansuri", 3, "BCA", 89.1f);
            Student std5 = new Student("Mantasha", 6, "B.Ed", 98.99f);
            Student std6 = new Student("Sakib Husain", 5, "D.Pharma", 69.11f);
            Student std7 = new Student("Sameer Ansari", 7, "B.Pharma", 61.79f);

            Student[] arr = {std1, std2, std3, std4, std5, std6, std7};
            int len = len(arr);
            System.out.println("Before sorting : ");
            printArray(arr, len);
            System.out.println("After sorting : ");
            sort(arr, "asc");
            printArray(arr, len);
        }

        public static Student[] sort(Student[] arr, String type) {
            int length = len(arr);

            switch (type) {
                case "asc":
                    for(int i=0; i<length-1; i++) {
                        for(int j=0; j<length-1; j++) {
                            if(arr[j].name.compareTo(arr[j + 1].name) > 0) {
                                String name = arr[j].name;
                                int roll = arr[i].roll;
                                String degree = arr[i].degree;
                                float marks = arr[i].marks;

                                arr[j].name = arr[j + 1].name;
                                arr[j + 1].name = name;

                                arr[j].roll = arr[j + 1].roll;
                                arr[j + 1].roll = roll;

                                arr[j].degree = arr[i + 1].degree;
                                arr[j + 1].degree = degree;

                                arr[j].marks = arr[j + 1].marks;
                                arr[j + 1].marks = marks;
                            }
                        }
                    }
                    break;

                case "desc":
                    for(int i=0; i<length; i++) {
                        for(int j=0; j<length; j++) {
                            if(arr[j].name.compareTo(arr[j + 1].name) == 0) {
                                String name = arr[j].name;
                                int roll = arr[i].roll;
                                String degree = arr[i].degree;
                                float marks = arr[i].marks;

                                arr[j].name = arr[j + 1].name;
                                arr[j + 1].name = name;

                                arr[j].roll = arr[j + 1].roll;
                                arr[j + 1].roll = roll;

                                arr[j].degree = arr[i + 1].degree;
                                arr[j + 1].degree = degree;

                                arr[j].marks = arr[j + 1].marks;
                                arr[j + 1].marks = marks;
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("There is no sorting method for this. Use only 'asc' for ascending and 'desc' for descending sort");
            }

            return arr;
        }

        public static int len(Student[] arr) {
            return arr.length;
        }

        public static void printArray(Student[] arr, int len){
            for(int i=0; i<len; i++) {
                arr[i].printDetails();
            }
        }
    }

    class Student {
        String name, degree;
        int roll;
        float marks;
        Student(String name, int roll, String degree, float marks) {
            this.name = name;
            this.roll = roll;
            this.degree = degree;
            this.marks = marks;
        }

        public void printDetails(){
            System.out.printf("Name    : %s \n", name);
            System.out.printf("Roll no : %d \n", roll);
            System.out.printf("Degree  : %s \n", degree);
            System.out.printf("Marks   : %.2f \n", marks);
            System.out.println();
        }

    }