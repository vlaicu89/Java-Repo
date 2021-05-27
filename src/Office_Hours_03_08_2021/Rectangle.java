package Office_Hours_03_08_2021;

import java.util.Scanner;
//PIC : Package-> Import -> Class

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lenght : ");
        double lenght = input.nextDouble();
        System.out.println("Enter your width : ");

        double width = input.nextDouble();

        // Hard coded values.
        //double lenght = 5;
        //double width = 3;

        // dynamic with scaner.

        double perimeter = 2 * (lenght + width);
        double area = lenght * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
