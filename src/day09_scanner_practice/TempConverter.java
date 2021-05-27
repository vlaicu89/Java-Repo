package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("### Fahrenheiht to Celsius ###" );
        System.out.println("Enter Fahrenheits : ");
        double fahrenheits = scan.nextDouble();
        System.out.println("Result is : ");
        double celsius = (fahrenheits - 32) * 5/9;
        System.out.println(fahrenheits + " Fahrenheits to Celsius: " + celsius);



    }
}
