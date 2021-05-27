package day08_casting_scanner;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1 and its price: ");
            String item1;
            double price1 = scan.nextDouble();
            System.out.println("Enter Item2 and its price: ");
            String item2;
            double price2 = scan.nextDouble();
            System.out.println("Enter Item3 and its price: ");
            String item3;
            double price3 = scan.nextDouble();
            double totalPrice = price1 + price2 + price3;
            System.out.println("Total price: " + totalPrice);
        }
    }

