package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {

// Pre increment
        int num3 = 10;
        int num4 = ++num3;
        System.out.println(num3);
        System.out.println(num4);

        int num5 = 4; // 4
        //int num6 = num5; // 4
        //num5++; // 4+1= 5
        int num6 = num5++;
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        int apples = 5;
        int basket = ++apples; // add one apple and then put them in the basket.
        System.out.println(apples);
        System.out.println("basket = " + basket);

        int kiwi = 8; //9
        int kiwiBasket = kiwi++; //8 - because we put already 8 in the basket, and 1 is extra and going to kiwi.
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int sedans = 10;
        System.out.println( sedans++); // print first
        System.out.println( sedans); // then is result increased already.

        int cars = 6;
        System.out.println( ++cars); // increase first and then print.
        
        int myNumber = 44;
        myNumber++;
        System.out.println("myNumber = " + myNumber); //45
        ++myNumber;
        System.out.println("myNumber = " + myNumber); //46

        myNumber = 20;
        System.out.println(++myNumber);

        myNumber = 33;
        System.out.println( myNumber++); //33 - because print first.
        System.out.println(myNumber); //34 - added already.

        int myNumberA= 15;
        int yourNumber = ++myNumberA;
        System.out.println(myNumber);         //16 - cuz add first and then print.
        System.out.println(yourNumber);// 16 - was increased already

        int g = 99;
        int f = g++;
        System.out.println(g); //100 - cuz was increased.
        System.out.println(f); //99 - cuz was asigned, and then g increased.

        int a = 5;
        int b = 4;
        int c = a++ + ++b;
        System.out.println(a); //6
        System.out.println(b); //5
        System.out.println(c); //10



    }
}
