package day49_static;

public class StaticTest {
    String word = "java";
    public static void main(String[] args) {
        // 1. Static method can be called using class name
        StaticMethods.displayMessage("Wooden spoon");

        // 2. To call an instance method we need to create an object
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // 3.static method can only access static variables and methods
       //  System.out.println(word); --->>> will not work cuz the class of the word is not static
        // to make it work, we need to make the variable static -->> static String word = "java";

    }
}
