package Office_Hours_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        // byte->short->int->long->float->double;
        byte b = 10;
        short s = b;
        byte b2 = (byte) s;

        double d = 5.3;
        int i = (short) d;
        int i2 = (int) d;

        int a1 = 22313;
        double a2 = a1;

       // double sp = 33.3;   // will not work,cuz double is larger than int.
        //int sp1 = sp;


        float f = 3.54f;
        float f2 = (float) 3.54;

        float f3 = 5;
        float f4 = 5.5f; // float = double

        long l = 22313; // long = int.
        long l2 = 31223444454433L;

        System.out.println(l);
        System.out.println(( double)l); // another method of cast.
        System.out.println((float)l);
        System.out.println(l2);

        double milion = 1_000_000;
        System.out.println( milion);

    }
}
