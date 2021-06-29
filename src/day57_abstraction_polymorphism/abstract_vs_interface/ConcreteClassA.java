package day57_abstraction_polymorphism.abstract_vs_interface;

public class ConcreteClassA extends AbstractA implements InterfaceA,InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethod implementation is called");

    }
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }
    // @Override -> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethod(int num) {

    }

    @Override
    public void defaultMethodF() {

    }
}
