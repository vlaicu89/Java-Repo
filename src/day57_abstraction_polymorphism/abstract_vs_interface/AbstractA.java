package day57_abstraction_polymorphism.abstract_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String type= "abstract";
    public abstract void absMethodA();
    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticC(){
        System.out.println("static method C is called");
    }
}
