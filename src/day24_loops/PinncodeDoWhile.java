package day24_loops;


import java.util.Scanner;

public class PinncodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pinCode;
        int secretPinCode = 1234;
        do{
            System.out.println("Enter PinCode");
            pinCode = scan.nextInt();

        }while(secretPinCode != pinCode);{

            System.out.println("Welcome to your account");
        }


    }
}
