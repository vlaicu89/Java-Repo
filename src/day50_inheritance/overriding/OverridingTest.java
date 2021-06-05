package day50_inheritance.overriding;

public class OverridingTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Labrador";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}
