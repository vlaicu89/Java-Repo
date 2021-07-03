package day58_polymorphism;

public class Amazon extends OnlineShop{
    @Override
    public void buy() {
        System.out.println("Buying products!");
    }

    @Override
    public void sell() {
        System.out.println("Selling products!");

    }

}
