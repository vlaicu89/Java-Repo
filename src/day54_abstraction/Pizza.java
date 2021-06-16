package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Hand toasted");

    }

    @Override
    public void serving() {
        System.out.println("Hot");

    }

    @Override
    public void charge() {
        System.out.println("15$ for medium size");

    }
}
