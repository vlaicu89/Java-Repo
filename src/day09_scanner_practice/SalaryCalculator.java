package day09_scanner_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate :");

        double hours = 40;
        double hourlyRate = 50.0;
        double weeklyRate = hours * hourlyRate;
        double monthlyRate = weeklyRate * 52/12;
        double anualRate = monthlyRate * 12;
        System.out.println("Weekly rate is : " + "$" + weeklyRate);
        System.out.println("Monthly rate is : " + "$" + monthlyRate);
        System.out.println("Annual rate is : " + "$" + anualRate);


    }
}
