package day57_abstraction_polymorphism.polymorphism.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // this is not polymorphism, cuz are the same
        a1.makeNoise();

        Animal animal  = new Dog();
        Animal animal1 = new Horse();
        Animal animal2 = new Cat();

        animal.makeNoise();
        animal1.makeNoise();
        animal2.makeNoise();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Horse());
        animals.add(new Cat());

        for(Animal each : animals){

            each.makeNoise();

        }
    }
}
