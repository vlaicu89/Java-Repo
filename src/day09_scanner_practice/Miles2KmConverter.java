package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("######## Miles to KM Converter ######");
        System.out.println("Enter miles : ");
        double miles = scan.nextDouble();
        System.out.println("Result is : " );
        double km = miles * 1.609;
        System.out.println(miles + " miles in kilometers: " + km);




    }
}
