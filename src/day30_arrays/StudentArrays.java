package day30_arrays;

import java.util.Locale;

public class StudentArrays {
    public static void main(String[] args) {
        String[] student1 = {"A1234", "Adam", "Smith", "B22", "805-864-4081"};
        String[] student2 = new String[5];
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student firstname = " + student1[1]);
        System.out.println("student lastname = " + student1[2]);
        System.out.println("student batch num = " + student1[3]);
        System.out.println("student phone num = " + student1[4]);

        System.out.println("student data length = " + student1.length);
        if (student1.length == 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fails");
        }


        if(student1.length == student2.length){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        System.out.println(student1[1].toUpperCase() + " "  + student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("805"));
    }
}
