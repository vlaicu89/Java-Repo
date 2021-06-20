package day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();

}
interface MyInterface2{

}
class MyClass implements MyInterface, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}
class main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); // can not create object.

        MyClass myClass = new MyClass();
        myClass.learn();
    }
}
