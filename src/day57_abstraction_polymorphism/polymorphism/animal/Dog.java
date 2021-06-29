package day57_abstraction_polymorphism.polymorphism.animal;

public class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Dog is saying gav gav");
    }
}
