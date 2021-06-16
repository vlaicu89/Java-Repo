package day54_abstraction;

public class Restaurant {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println("------Pizza-------");
        pizza.prepare();
        pizza.serving();
        pizza.charge();

        Salad salad = new Salad();
        System.out.println("------Salad--------");
        salad.prepare();
        salad.serving();
        salad.charge();
    }
}
