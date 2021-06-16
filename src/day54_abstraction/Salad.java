package day54_abstraction;

public class Salad extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Cut the veggies");

    }

    @Override
    public void serving() {
        System.out.println("Serving with meet");

    }

    @Override
    public void charge() {
        System.out.println("Charge 5$");

    }
}
