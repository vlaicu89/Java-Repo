package day57_abstraction_polymorphism.abstract_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA(); --->> Can not create object from abstract and interface
        InterfaceA.staticMethodE("wooden spoon");
        ConcreteClassA.staticMethodC();




    }
}
