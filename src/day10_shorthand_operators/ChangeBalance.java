package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // decrease price by baklava price.
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        
        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after kenafa = " + balance);

        //second kenafe is 50% off. let's buy it.

        kenafa = kenafa / 2;
        System.out.println("kenafa =  " + kenafa);
        //buy it and decrease price with kenafe price.

        balance = balance - kenafa;
        System.out.println("balance after second kenafa =" + balance);

        //return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);
    }
}
