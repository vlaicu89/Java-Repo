package day57_abstraction_polymorphism.polymorphism.animal;

public class Horse extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Horse is saying i-ha-ha");
    }
}
