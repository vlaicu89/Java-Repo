package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeScannerVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("How old are you?");
        scan.nextInt(); // asta in cazul cint avem de postat numere.

        int age = scan.nextInt();
        System.out.println(age + " - that's grea!");




    }
}
