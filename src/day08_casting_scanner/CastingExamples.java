package day08_casting_scanner;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main(String[] args) {
        byte num1= 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;
        int num8 = 3456;
        double num9 = (int)num8;
        System.out.println(num8);
        System.out.println("num9 = " + num9);

        //Explicit casting, unde una din variabile este mai mica si trebuie de pus paranteze.

         int num10 = 22;
         byte num11 = (byte) num10;
         short num12 = (short)num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float)num13;

        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num 15 = " + num15);  //1234.5
        System.out.println("num 16 = " + num16);  //1234   --->>> deoarece int e fara zecimale,si se converteaza automat

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " +num17); // 300
        System.out.println("num18 = " +num18);  // 44 ==>>> deoarece byte este pina la 227, si respectiv
                                               //

        char letter = 'S';
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numLetter = " + numLetter); // beause each letter in char has a number, and S = 83.
    }



}
