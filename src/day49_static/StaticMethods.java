package day49_static;

public class StaticMethods {
    int num = 10;
    static int count = 5;
    public static void displayMessage(String message){
        System.out.println("message: " + message );
        //System.out.println("num: " + num); --->>>cis error, because first method is not static
        System.out.println("count = " + count); // no error because count is static variable
    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("Hi!Wooden spoon!");
    }
    //StaticMethods.instanceMethod() --->>> no
    // StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");
    }
}
