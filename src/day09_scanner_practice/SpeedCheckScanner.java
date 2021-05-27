package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheckScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your speed is over ");
        int speedLimit = 55;
        int yourSpeed = scan.nextInt();
        int overTheLimit = yourSpeed - speedLimit;
        System.out.println("Your speed is over " + overTheLimit + " mph.");



    }
}
