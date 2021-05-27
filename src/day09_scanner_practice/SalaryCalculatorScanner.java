package day09_scanner_practice;

import java.util.Scanner;


public class SalaryCalculatorScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = hourlyRate * 40;
        double monthlyPay = weeklyRate * 52/12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly rate is:" + weeklyRate);
        System.out.println("Monthly pay is: " + monthlyPay);
        System.out.println("Annual pay is: " + annualPay);



    }
}
