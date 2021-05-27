package day12_conditional_statements;

import java.util.Scanner;


public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price : ");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25){ // if under 25$, will show second, if more than 25, then first.
            System.out.println("Free Shipping eligible. Your order total $" + totalPrice);

        }else{
            System.out.println("Not eligible for free shipping. Your order total $" + totalPrice);
        }





    }
}
