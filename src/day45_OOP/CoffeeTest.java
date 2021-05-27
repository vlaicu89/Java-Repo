package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.amount);
        myCoffee.drink(50);
        System.out.println("amount after drink 50 = " + myCoffee.amount);

        //myCoffee.type = "Turkish coffee" --->>> not this way
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString()); // will give us the amount and type of our coffee

        //add another coffee objects, set values, add methods.
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //assign coffee1 to object coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccinno");
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());
    }
}
